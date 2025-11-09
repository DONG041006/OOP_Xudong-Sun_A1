public class GeneralPractitioner extends HealthProfessional {
    // 子类独特实例变量：全科诊所位置
    private String generalPracticeLocation;

    // 1. 默认构造器
    public GeneralPractitioner() {
        super(); // 调用基类默认构造器
        this.generalPracticeLocation = "Unknown Location";
    }

    // 2. 带参构造器（初始化基类+子类属性）
    public GeneralPractitioner(int id, String name, String specializationField, String generalPracticeLocation) {
        super(id, name, specializationField); // 调用基类带参构造器
        this.generalPracticeLocation = generalPracticeLocation;
    }

    // 3. 打印方法（含医生类型）
    @Override
    public void printDetails() {
        System.out.println("=== Health Professional Type: General Practitioner ===");
        super.printDetails(); // 调用基类打印方法，避免代码重复
        System.out.println("General Practice Location: " + generalPracticeLocation);
        System.out.println(); // 空行，优化输出格式
    }

    // Getter（后续预约系统可能需要访问，可选但推荐）
    public String getGeneralPracticeLocation() {
        return generalPracticeLocation;
    }
}