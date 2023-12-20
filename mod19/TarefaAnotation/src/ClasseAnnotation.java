@AnnotationDiego(name = "Diego")
public class ClasseAnnotation {

    @AnnotationDiego(name = "Diego")
   private String name;

    public ClasseAnnotation(String name) {
    }

    public ClasseAnnotation(){

    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClasseAnnotation {" +
                "name = '" + name + '\'' +
                '}';
    }
}
