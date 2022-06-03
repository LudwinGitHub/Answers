import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Answers {
    /**
     * Name: Mateusz
     * Surname: Ludwin
     * Date of birth: 10.07.1989
     * Experience:
     *
     *
     * Answers:
     * JDK is a Java Development Kit and includes Java Runtime Environment (JRE).
     * The JDK also includes development tools. Tools and JRE in a package are JDK.
     * JDK provides environment to develop and run Java programs and the JRE provides
     * only to run applications.
     *
     * Javac [name].java is a command which create a file with .class extension.
     *
     *Each class have a constructor. Even if we do not write a constructor, it will be
     * automatically generated with no parameters.
     *
     * Class is the elementary entity in Java which gather related fields and methods.
     * Interface is a kind of contract which all classes that implements it needs to fulfill.
     * Each Java class can inherit only from one class but can implement several interfaces.
     * Interfaces unlike classes can not have static methods.
     *
     * byte, int, double, short, long, float, char and boolean.
     *
     * Checked exceptions unlike unchecked are required to handle.
     * Checked exceptions happen in a compilation while unchecked in a runtime.
     *
     * The main access modifiers are private, public and protected. Each of them provides
     * different type of encapsulations.
     * Private modifier restrict accessibility only to the class.
     * Public modifiers indicates that access this element (class, interface, etc.) from any package.
     * Protected elements are visible only in the class and inheriting classes.
     *
     * String is immutable.
     *
     * Most commonly used loops in Java are for loop and for-each loop.
     * We can also use do-while and while
     *
     * Maven:
     * Maven is a automatic project building tool. It validates and compile the written code.
     * Manage tests and provides dependencies.
     *
     * Java projects developed in Maven contain pom.xml file which allows including
     * dependencies and plugins and  project configuration.
     * Maven projects are divided in folders and packages.
     * Main code will be written in src/main/java while the tests will
     * be written in src/test catalogue.
     *
     * Pom.xml contain basic project information like encoding and version.
     * Moreover, it contains unique groupId and artifactId. In addition, pom.xml
     * provides dependencies and plugins in our projects.
     *
     * There are 3 different life cycles which we can distinguish in Maven.
     * They are default, clean and site.
     *
     * Phases in Maven are packing, installation and deploying.
     *
     * Plugins are special maven projects which are created to provide specific work
     * like compile code files.
     * Plugins should be configured in pom.xml file.
     *
     * Compile, deploy and install plugins.
     *
     * Target directory is used to gather all output elements.
     *
     * Git:
     * Git is a version control system which allows several developer to work on
     * same project simultaneously. Git track all changes done in code.
     *
     * Remote branches are all the branches on the remote machines, while with
     * local branch you are working on your machine.
     *
     * We need to use command git fetch (remote branch name).
     *
     *  Git pull allows downloading additional data and merge it with our code.
     *  Git fetch download data from remote project.
     *
     *  Git merge allows connecting changes in your code with another branch.
     *  Git rebase gather chronologically all changes in specific branch.
     *
     *  Conflicts can appear while we use pull request and the same file was
     *  changed in several ways in the same place. To fix this situation we should
     *  actualize branches. git merge or rebase.
     *
     *  Three levels of git configurations are project, global and system.
     *
     *  Gitflow it's a special model of working with different branches.
     */

    static void characterCounter(String word){
        HashMap<Character, Integer> charMap = new HashMap<>();

        char[] array = word.toCharArray();
        Arrays.sort(array);

        for (char c : array) {
            if (charMap.containsKey(c)){
                charMap.put(c, charMap.get(c) + 1);
            }
            else charMap.put(c, 1);
        }
        for (Map.Entry entry : charMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String word = "academy";
        characterCounter(word);
    }
}
