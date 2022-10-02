package video.com.video.enumeration;

import lombok.AllArgsConstructor;

/**
 * @author lijiang
 * @date 2021-05-18
 */
/**
 * @param type
 * @param name
 * @param msg
 */
@AllArgsConstructor
public enum MonitoringType {
    SMOKE(1,"smoke","吸烟检测"),
    TRUCK(2,"truck","文保单位异常检测"),
    TRAFFIC(3,"person","出入口人员检测"),
    PERSON(4,"noMask","未戴口罩检测"),
    FACE(5,"face","人脸检测");

    public Integer type;
    private String name;
    private String msg;

    public static String getName(Integer type) {
        for (MonitoringType monitoringType : MonitoringType.values()) {
            if (monitoringType.type.equals(type)) {
                return monitoringType.name;
            }
        }
        return null;
    }

    public static Integer getType(String name) {
        for (MonitoringType monitoringType : MonitoringType.values()) {
            if (monitoringType.name.equals(name)) {
                return monitoringType.type;
            }
        }
        return null;
    }

    public static String getMsg(Integer type) {
        for (MonitoringType monitoringType : MonitoringType.values()) {
            if (monitoringType.type.equals(type)) {
                return monitoringType.msg;
            }
        }
        return null;
    }
}
