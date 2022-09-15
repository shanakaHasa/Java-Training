package equality.com;

public class Items {
    private Integer id;
    private Integer item_code;
    private String Name;
    private String Address;

    public Items(int id,int code,String name,String address){
        this.id=id;
        this.item_code=code;
        this.Name=name;
        this.Address=address;
    }

    @Override
    public boolean equals(Object object){
       if(object==null){
           return false;

       }else if (object instanceof Items) {
           Items item=(Items) object;
           return this.id.equals(item.id)&&this.item_code.equals(item.item_code)&&true||false;

        } else {
           return false;
       }

    }

}
