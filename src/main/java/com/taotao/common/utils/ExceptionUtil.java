package com.taotao.common.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Author: zhihu
 * Description:
 * Date: Create in 19:45 2018/2/6
 */
public class ExceptionUtil {
        /**
         * 获取异常的堆栈信息
         *
         * @param t
         * @return
         */
        public static String getStackTrace(Throwable t) {
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);

                try {
                        t.printStackTrace(pw);
                        return sw.toString();
                } finally {
                        pw.close();
                }
        }
}
