package com.qinshijia.baseproject.util;

import android.text.TextUtils;
import android.util.Log;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;


/**
 * 日志输出工具
 */
public class LogUtil {

    public static final boolean SHOW_LOG = true;
    private static final int METHOD_OFFSET = 3; //方法偏移位置
    private static final String TAG = "BASE_PROJECT";

    public static void d(String message, Object... args) {
        if (SHOW_LOG) {
            Log.d(TAG, createMessage(message,args));
        }

    }

    public static void e(@NonNull String message, @Nullable Object... args) {
        Log.e(TAG, createMessage(message,args));
    }

    public static void e(@Nullable Throwable throwable, @NonNull String message, @Nullable Object... args) {
        Log.e(TAG, createMessage(message,args));
        throwable.printStackTrace();
    }

    public static void i(@NonNull String message, @Nullable Object... args) {
        if (SHOW_LOG) {
            Log.i(TAG, createMessage(message,args));
        }
    }

    public static void v(@NonNull String message, @Nullable Object... args) {
        if (SHOW_LOG) {
            Log.v(TAG, createMessage(message,args));
        }
    }

    public static void w(@NonNull String message, @Nullable Object... args) {
        if (SHOW_LOG) {
            Log.w(TAG, createMessage(message,args));
        }
    }

    public static void wtf(@NonNull String message, @Nullable Object... args) {
        if (SHOW_LOG) {
            Log.wtf(TAG, createMessage(message,args));
        }
    }

    //生成log内容
    private static String createMessage(String message,Object... args) {
        String method = getNameFromTrace(METHOD_OFFSET);
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(message)) {
            sb.append("NULL");
        } else if (args.length > 0) {
            String msg = String.format(message, args);
            sb.append(msg);
        } else {
            sb.append(message);
        }

        sb.append(" ").append(method);
        return sb.toString();
    }

    //获取方法和所在文件位置，以便点击可以跳转
    private static String getNameFromTrace( int place) {
        StackTraceElement[] traceElements = new Throwable().getStackTrace();

        StringBuilder taskName = new StringBuilder();
        if (traceElements != null && traceElements.length > place) {
            StackTraceElement traceElement = traceElements[place];
            taskName.append("=>");
            taskName.append(traceElement.getMethodName());
            taskName.append("(").append(traceElement.getFileName()).append(":").append(traceElement.getLineNumber()).append(")");
        }
        return taskName.toString();
    }
}
