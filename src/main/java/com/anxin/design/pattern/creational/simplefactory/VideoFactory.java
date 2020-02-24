/*
 * Copyright (C) 2018 anxin All rights reserved.
 *
 * Created by shouax on 2019/12/28 17:54.
 */

package com.anxin.design.pattern.creational.simplefactory;

/**
 * 〈〉.
 *
 * @author: shouanxin
 * @date: 2019/12/28
 */
public class VideoFactory {
//    public static Video getVideo(String type) {
//        switch (type) {
//            case "java":
//                return new JavaVideo();
//            case "python":
//                return new PythonVideo();
//            default:
//                return null;
//        }
//    }
    /**
     * 功能描述: 〈反射〉.
     *
     * @param type
     * @return  com.anxin.design.pattern.creational.simplefactory.Video
     * @author shouanxin
     * @date  2019/12/28 18:02
     */
    public static Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
