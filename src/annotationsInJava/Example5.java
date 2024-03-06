package annotationsInJava;



    /**
     * Dummy Annotation
     */
    @interface MyAnnotation {

    }

    @MyAnnotation

        public class Example5 {
            @MyAnnotation
            public static void main(@MyAnnotation String... args) {
                @MyAnnotation
                int x;
            }
        }


