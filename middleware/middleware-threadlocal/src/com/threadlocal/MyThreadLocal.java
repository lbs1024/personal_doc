package com.threadlocal;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author lbs
 * @description 自定义实现ThreadLocal
 */
public class MyThreadLocal extends ThreadPoolExecutor {
    ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    private static final Logger log = LoggerFactory.getLogger(MyThreadLocal.class);

    private ThreadLocal<Integer> local = ThreadLocal.withInitial(() -> 0);

    public MyThreadLocal(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, getWorkQueue());
    }

    public MyThreadLocal(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, ThreadFactory threadFactory) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, getWorkQueue(), threadFactory);
    }

    public MyThreadLocal(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, getWorkQueue(), handler);
    }

    public MyThreadLocal(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, getWorkQueue(), threadFactory, handler);
    }

    protected static PriorityBlockingQueue getWorkQueue() {
        return new PriorityBlockingQueue();
    }

    @Override
    public void execute(Runnable command) {
        int priority = local.get();
        try {
            this.execute(command, priority);
        } finally {
            local.set(0);
        }
    }

    public void execute(Runnable command, int priority) {
        super.execute(new PriorityRunnable(command, priority));
    }

    public <T> Future<T> submit(Callable<T> task, int priority) {
        local.set(priority);
        return super.submit(task);
    }

    public Future<?> submit(Runnable task, int priority) {
        local.set(priority);
        return super.submit(task);
    }

    protected static class PriorityRunnable<E extends Comparable<? super E>> implements Runnable, Comparable<PriorityRunnable<E>> {
        private final static AtomicLong seq = new AtomicLong();
        private final long seqNum;
        Runnable run;
        private int priority;

        public PriorityRunnable(Runnable run, int priority) {
            seqNum = seq.getAndIncrement();
            this.run = run;
            this.priority = priority;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public Runnable getRun() {
            return run;
        }

        @Override
        public int compareTo(PriorityRunnable<E> o) {
            int res = 0;
            if (this.priority == o.priority) {
                if (o.run != this.run) {
                    res = (seqNum < o.seqNum ? -1 : 1);
                }
            } else {
                res = this.priority > o.priority ? -1 : 1;
            }
            return res;
        }

        @Override
        public void run() {
            this.run.run();
        }
    }
}
