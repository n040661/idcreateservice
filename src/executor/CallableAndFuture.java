package executor;/**
 * Created by lvaolin on 17/10/18.
 */

import java.util.concurrent.*;

/**
 * @author lvaolin
 * @create 17/10/18 下午2:24
 */
public class CallableAndFuture {




    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(new Callable<String>() {


            @Override
            public String call() throws Exception {
                return "zhangsan";
            }
        });


        System.out.println("任务的执行结果："+future.get());

        executorService.shutdownNow();
    }

}
