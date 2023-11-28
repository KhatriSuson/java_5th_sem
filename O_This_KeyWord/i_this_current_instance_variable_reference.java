package O_This_KeyWord;

public class i_this_current_instance_variable_reference {
    void hi() {
        System.out.println(this);  // displays same reference id
    }

    public static void main(String[] args) {
        i_this_current_instance_variable_reference obj = new i_this_current_instance_variable_reference();
        System.out.println(obj);  // displays the reference id
        obj.hi();
    }
    
}
