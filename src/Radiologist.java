public class Radiologist extends HealthProfessional {
    // 子类独特实例变量：放射设备类型
    private String radiologyEquipmentType;

    // 1. 默认构造器
    public Radiologist() {
        super();
        this.radiologyEquipmentType = "Unknown Equipment";
    }

    // 2. 带参构造器
    public Radiologist(int id, String name, String specializationField, String radiologyEquipmentType) {
        super(id, name, specializationField);
        this.radiologyEquipmentType = radiologyEquipmentType;
    }

    // 3. 打印方法（含医生类型）
    @Override
    public void printDetails() {
        System.out.println("=== Health Professional Type: Radiologist ===");
        super.printDetails();
        System.out.println("Radiology Equipment Type: " + radiologyEquipmentType);
        System.out.println(); // 空行，优化输出格式
    }

    // Getter（后续预约系统可能需要访问，可选但推荐）
    public String getRadiologyEquipmentType() {
        return radiologyEquipmentType;
    }
}