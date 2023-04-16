/*
 *
 * Copyright (c) 2018 FORYOU GENERAL ELECTRONICS CO.,LTD. All Rights Reserved.
 *
 */


package com.mvvm.commonbase.Utils;

import android.util.Log;

/**
 * @author hywen
 * @date 2018-05-10
 */
public class LogUtils {
    /**
     *
     * The log is checked in isLoggable. So, to toggle all logs allowed by the
     *  you can set properties:
     *
     * adb shell setprop log.tag.XXX VERBOSE
     * adb shell setprop log.tag.XXX ""
     * setprop log.tag.XXX V
     */

    private static String mFileName;
    private static String mMethodName;
    private static int mLineNumber;

    /**
     *
     * @param log create log msg
     * @return  the detail message to print
     */
    private static String createLog(String log ) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(mFileName);
        buffer.append("(").append(mMethodName).append(":").append(mLineNumber).append(")");
        buffer.append(log);
        return buffer.toString();
    }

    /**
     *@param sElements to get className methodName lineNumber
     *
     */
    private static void getMethodNames(StackTraceElement[] sElements){
        mFileName = sElements[1].getFileName();
        mMethodName = sElements[1].getMethodName();
        mLineNumber = sElements[1].getLineNumber();
    }

    /**
     *
     * @param tag log.tag
     * @param msg message to print
     */
    public static void d(String tag, String msg) {
        if (Log.isLoggable(tag, Log.DEBUG)) {
            Log.d(tag, msg);
        }
    }

    /**
     *
     * @param tag log.tag
     * @param msg Long message to print,with className methodName lineNumber
     */
    public static void dL(String tag, String msg) {
        Log.d(tag, msg);
        /*
        if (android.util.Log.isLoggable(tag, android.util.Log.DEBUG)) {
            getMethodNames(new Throwable().getStackTrace());
            android.util.Log.d(tag, createLog(msg));
        }*/
    }

    /**
     *
     * @param tag log.tag
     * @param msg message to print
     */
    public static void e(String tag, String msg) {
        if (Log.isLoggable(tag, Log.ERROR)) {
            Log.e(tag, msg);
        }
    }

    /**
     *
     * @param tag log.tag
     * @param msg Long message to print,with className methodName lineNumber
     */
    public static void eL(String tag, String msg) {
        if (Log.isLoggable(tag, Log.ERROR)) {

            getMethodNames(new Throwable().getStackTrace());
            Log.e(tag, createLog(msg));
        }
    }

    /**
     *
     * @param tag log.tag
     * @param msg message to print
     */
    public static void i(String tag, String msg) {
        if (Log.isLoggable(tag, Log.INFO)) {
            Log.i(tag, msg);
        }
    }

    /**
     *
     * @param tag log.tag
     * @param msg Long message to print,with className methodName lineNumber
     */
    public static void iL(String tag, String msg) {
        if (Log.isLoggable(tag, Log.INFO)) {
            getMethodNames(new Throwable().getStackTrace());
            Log.i(tag, createLog(msg));
        }
    }

    /**
     *
     * @param tag log.tag
     * @param msg message to print
     */
    public static void v(String tag, String msg) {
        if (Log.isLoggable(tag, Log.VERBOSE)) {
            Log.v(tag, msg);
        }
    }

    /**
     *
     * @param tag log.tag
     * @param msg Long message to print,with className methodName lineNumber
     */
    public static void vL(String tag, String msg) {
        if (Log.isLoggable(tag, Log.VERBOSE)) {
            getMethodNames(new Throwable().getStackTrace());
            Log.v(tag, createLog(msg));
        }
    }

    /**
     *
     * @param tag log.tag
     * @param msg message to print
     */
    public static void w(String tag, String msg) {
        if (Log.isLoggable(tag, Log.WARN)) {
            Log.w(tag, msg);
        }
    }

    /**
     *
     * @param tag log.tag
     * @param msg Long message to print,with className methodName lineNumber
     */
    public static void wL(String tag, String msg) {
        if (Log.isLoggable(tag, Log.WARN)) {
            getMethodNames(new Throwable().getStackTrace());
            Log.w(tag, createLog(msg));
        }
    }
}
