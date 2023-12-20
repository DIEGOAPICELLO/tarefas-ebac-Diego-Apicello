import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        ClasseAnnotation name = new ClasseAnnotation();
        name.setName("Diego");
        System.out.println(name);

        System.out.println("*************************************");

        ClasseTabela name1 = new ClasseTabela();

        Class<?> classe = name1.getClass();

        if(classe.isAnnotationPresent(Tabela.class)){
            Tabela tab = classe.getAnnotation(Tabela.class);
            String nameTab = tab.name();
            System.out.println("Nome da tabela: " + nameTab);
        } else {
            System.out.println("Sem tabela associada");
        }

        try {
            Method metodoTabela = classe.getDeclaredMethod("setName", String.class);
            metodoTabela.invoke(name1, "nome da tabela");

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(name1);

    }
}