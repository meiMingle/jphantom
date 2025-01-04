import org.objectweb.asm.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ClassGenMain implements Opcodes {
    public static void main(String[] args) throws IOException {
        try {
            byte[] dumpA = genClassA();
            Files.write(Paths.get("src/test/resources/demo", "MembersWithSameName.class"), dumpA);

            byte[] dumpB = genClassB();
            Files.write(Paths.get("src/test/resources/demo", "MembersWithSameNameAccessor.class"), dumpB);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static byte[] genClassA() throws Exception {

        ClassWriter classWriter = new ClassWriter(0);
        FieldVisitor fieldVisitor;
        RecordComponentVisitor recordComponentVisitor;
        MethodVisitor methodVisitor;
        AnnotationVisitor annotationVisitor0;

        classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "demo/MembersWithSameName", null, "java/lang/Object", null);

        classWriter.visitSource("MembersWithSameName.java", null);

        {
            fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "a", "Z", null, null);
            fieldVisitor.visitEnd();
        }
        {
            fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "a", "I", null, null);
            fieldVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(I)V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(9, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(10, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitVarInsn(ILOAD, 1);
            methodVisitor.visitFieldInsn(PUTFIELD, "demo/MembersWithSameName", "a", "I");
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(11, label2);
            methodVisitor.visitInsn(RETURN);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLocalVariable("this", "Ldemo/MembersWithSameName;", null, label0, label3, 0);
            methodVisitor.visitLocalVariable("a", "I", null, label0, label3, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "a", "(Ljava/lang/String;)F", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(14, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            Label label1 = new Label();
            methodVisitor.visitJumpInsn(IFNULL, label1);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "isEmpty", "()Z", false);
            methodVisitor.visitJumpInsn(IFNE, label1);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(15, label2);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Float", "parseFloat", "(Ljava/lang/String;)F", false);
            methodVisitor.visitInsn(FRETURN);
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(17, label1);
            methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
            methodVisitor.visitLdcInsn(new Float("3.4028235E38"));
            methodVisitor.visitInsn(FRETURN);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLocalVariable("var0", "Ljava/lang/String;", null, label0, label3, 0);
            methodVisitor.visitMaxs(1, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "a", "(Ljava/lang/String;)B", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(21, label0);
            methodVisitor.visitVarInsn(ALOAD, 1);
            Label label1 = new Label();
            methodVisitor.visitJumpInsn(IFNULL, label1);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "isEmpty", "()Z", false);
            methodVisitor.visitJumpInsn(IFNE, label1);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(22, label2);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitFieldInsn(GETSTATIC, "java/nio/charset/StandardCharsets", "UTF_8", "Ljava/nio/charset/Charset;");
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/nio/charset/Charset;)[B", false);
            methodVisitor.visitInsn(ICONST_0);
            methodVisitor.visitInsn(BALOAD);
            methodVisitor.visitInsn(IRETURN);
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(24, label1);
            methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
            methodVisitor.visitIntInsn(BIPUSH, 127);
            methodVisitor.visitInsn(IRETURN);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLocalVariable("this", "Ldemo/MembersWithSameName;", null, label0, label3, 0);
            methodVisitor.visitLocalVariable("var0", "Ljava/lang/String;", null, label0, label3, 1);
            methodVisitor.visitMaxs(2, 2);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(6, label0);
            methodVisitor.visitInsn(ICONST_1);
            methodVisitor.visitFieldInsn(PUTSTATIC, "demo/MembersWithSameName", "a", "Z");
            methodVisitor.visitInsn(RETURN);
            methodVisitor.visitMaxs(1, 0);
            methodVisitor.visitEnd();
        }
        classWriter.visitEnd();

        return classWriter.toByteArray();
    }

    public static byte[] genClassB() throws Exception {

        ClassWriter classWriter = new ClassWriter(0);
        FieldVisitor fieldVisitor;
        RecordComponentVisitor recordComponentVisitor;
        MethodVisitor methodVisitor;
        AnnotationVisitor annotationVisitor0;

        classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "demo/MembersWithSameNameAccessor", null, "java/lang/Object", null);

        classWriter.visitSource("MembersWithSameNameAccessor.java", null);

        {
            methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(3, label0);
            methodVisitor.visitVarInsn(ALOAD, 0);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
            methodVisitor.visitInsn(RETURN);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLocalVariable("this", "Ldemo/MembersWithSameNameAccessor;", null, label0, label1, 0);
            methodVisitor.visitMaxs(1, 1);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(0, "m1", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(5, label0);
            methodVisitor.visitFieldInsn(GETSTATIC, "demo/MembersWithSameName", "a", "Z");
            methodVisitor.visitVarInsn(ISTORE, 1);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(7, label1);
            methodVisitor.visitLdcInsn("test");
            methodVisitor.visitMethodInsn(INVOKESTATIC, "demo/MembersWithSameName", "a", "(Ljava/lang/String;)F", false);
            methodVisitor.visitVarInsn(FSTORE, 2);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(9, label2);
            methodVisitor.visitInsn(RETURN);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLocalVariable("this", "Ldemo/MembersWithSameNameAccessor;", null, label0, label3, 0);
            methodVisitor.visitLocalVariable("boolValue", "Z", null, label1, label3, 1);
            methodVisitor.visitLocalVariable("floatValue", "F", null, label2, label3, 2);
            methodVisitor.visitMaxs(1, 3);
            methodVisitor.visitEnd();
        }
        {
            methodVisitor = classWriter.visitMethod(0, "m2", "()V", null, null);
            methodVisitor.visitCode();
            Label label0 = new Label();
            methodVisitor.visitLabel(label0);
            methodVisitor.visitLineNumber(12, label0);
            methodVisitor.visitTypeInsn(NEW, "demo/MembersWithSameName");
            methodVisitor.visitInsn(DUP);
            methodVisitor.visitInsn(ICONST_0);
            methodVisitor.visitMethodInsn(INVOKESPECIAL, "demo/MembersWithSameName", "<init>", "(I)V", false);
            methodVisitor.visitVarInsn(ASTORE, 1);
            Label label1 = new Label();
            methodVisitor.visitLabel(label1);
            methodVisitor.visitLineNumber(14, label1);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitFieldInsn(GETFIELD, "demo/MembersWithSameName", "a", "I");
            methodVisitor.visitVarInsn(ISTORE, 2);
            Label label2 = new Label();
            methodVisitor.visitLabel(label2);
            methodVisitor.visitLineNumber(16, label2);
            methodVisitor.visitVarInsn(ALOAD, 1);
            methodVisitor.visitLdcInsn("test");
            methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "demo/MembersWithSameName", "a", "(Ljava/lang/String;)B", false);
            methodVisitor.visitVarInsn(ISTORE, 3);
            Label label3 = new Label();
            methodVisitor.visitLabel(label3);
            methodVisitor.visitLineNumber(17, label3);
            methodVisitor.visitInsn(RETURN);
            Label label4 = new Label();
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLocalVariable("this", "Ldemo/MembersWithSameNameAccessor;", null, label0, label4, 0);
            methodVisitor.visitLocalVariable("obj", "Ldemo/MembersWithSameName;", null, label1, label4, 1);
            methodVisitor.visitLocalVariable("intVale", "I", null, label2, label4, 2);
            methodVisitor.visitLocalVariable("byteValue", "B", null, label3, label4, 3);
            methodVisitor.visitMaxs(3, 4);
            methodVisitor.visitEnd();
        }
        classWriter.visitEnd();

        return classWriter.toByteArray();
    }
}
