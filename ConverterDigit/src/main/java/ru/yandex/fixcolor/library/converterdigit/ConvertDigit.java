package ru.yandex.fixcolor.library.converterdigit;

public class ConvertDigit {
    public static void int2bytes(int source, byte[] target, int indx) {
        int i = 4;
        do {
            target[indx] = (byte) (source & 0xff);
            source >>= 8;
            indx++;
            i--;
        } while (i > 0);
    }
    public static void int2bytes(long source, byte[] target, int indx) {
        int i = 4;
        do {
            target[indx] = (byte) (source & 0xff);
            source >>= 8;
            indx++;
            i--;
        } while (i > 0);
    }
    public static void int2bytes(int source, byte[] target, int indx, int lenght) {
        do {
            target[indx] = (byte) (source & 0xff);
            source >>= 8;
            indx++;
            lenght--;
        } while (lenght > 0);
    }
    public static void int2bytes(long source, byte[] target, int indx, int lenght) {
        do {
            target[indx] = (byte) (source & 0xff);
            source >>= 8;
            indx++;
            lenght--;
        } while (lenght > 0);
    }
    public static long bytes2int(byte[] source, int indx, int lenght) {
        long s = 0;
        int m = lenght + indx - 1;
        int j;
        for (int i = 0; i < lenght; i++) {
            j = m - i;
            s = s * 256 + (source[j] & 0xff);
        }
        return s;
    }
    public static long bytes2int(byte[] source, int indx) {
        int lenght = 4;
        long s = 0;
        int m = lenght + indx - 1;
        int j;
        for (int i = 0; i < lenght; i++) {
            j = m - i;
            s = s * 256 + (source[j] & 0xff);
        }
        return s;
    }
}
