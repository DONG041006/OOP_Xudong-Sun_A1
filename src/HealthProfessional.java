public class HealthProfessional {
    // 实例变量
    private int id; // 仅数字
    private String name; // 医生姓名
    private String specializationField; // 通用属性：专业领域

    // 1. 默认构造器
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specializationField = "General Health";
    }

    // 2. 带参构造器（初始化所有实例变量）
    public HealthProfessional(int id, String name, String specializationField) {
        this.id = id;
        this.name = name;
        this.specializationField = specializationField;
    }

    // 3. 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("Health Professional ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Specialization Field: " + specializationField);
    }

    // Getter和Setter（子类需要访问基类属性时使用，可选但推荐）
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecializationField() {
        return specializationField;
    }
}