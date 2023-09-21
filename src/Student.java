class Student {
    String name;
    int age;
    String address;
    int soLanHoc=0;
    public void study(){
        soLanHoc++;
    }
    public String doiten(String newName){
        name = newName;
        return newName;
    }

//    constructor
    public Student(){}
    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
