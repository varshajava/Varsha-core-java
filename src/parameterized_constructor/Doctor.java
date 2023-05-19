package parameterized_constructor;

public class Doctor {

    String name;
    String spec;
    int fee;

    public Doctor(String name, String spec, int fee) {
        this.name = name;
        this.spec = spec;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }


    public static void main(String[] args)
    {
        Doctor obj1=new Doctor("DR.Amrita","Neurologist",2500);
        System.out.println("name : "+obj1.name+" Specialization : "+obj1.spec+" Fee : "+obj1.fee);
        //changing name from Dr.Amrita to Dr.Amrita Gulleria
        obj1.setName("Dr.Amrita Gulleria");
        System.out.println("name after modification "+obj1.getName());
        Doctor obj2=new Doctor("Dr Priya","Cardiologist",1000);
        System.out.println("name : "+obj2.name+" Specialization : "+obj2.spec+" Fee : "+obj2.fee);
        //changing specialization Cardiologist to Radiologist
        obj2.setSpec("Radiologist");
        System.out.println("Specialization after modification : "+obj2.getSpec());
        Doctor obj3=new Doctor("Dr.Arun","Oncologist",1200);
        System.out.println("name : "+obj3.name+" Specialization : "+obj3.spec+" Fee : "+obj3.fee);
        //changing fee from 1200 to 1100;
        obj3.setFee(1100);
        System.out.println("Fee after modification : "+obj3.getFee() );
        Doctor obj4=new Doctor("Dr.Prabhakar","Pulmonologist",2000);
        System.out.println("name : "+obj4.name+" Specialization : "+obj4.spec+" Fee : "+obj4.fee);
        Doctor obj5=new Doctor("Dr.Shiv","Pediatrician",1500);
        System.out.println("name : "+obj5.name+" Specialization : "+obj5.spec+" Fee : "+obj5.fee);

    }
}
