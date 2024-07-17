public class NumberExtractor {
    public static void main(String[] args) {
        String input = "abcd123.456";
        // 输出 "123.45"
        System.out.println(extractNumber(input));

        // 输出 "123.00"
        input = "abcd123";
        System.out.println(extractNumber(input));
    }

    public static String extractNumber(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        // 使用正则表达式找到字符串中的数字部分
        String numberPart = input.replaceAll("[^0-9.]", "");

        // 判断数字部分是否包含小数点
        if (numberPart.contains(".")) {
            int dotIndex = numberPart.indexOf(".");
            // 截取小数点前两位数字和小数点后两位数字
            return numberPart.substring(0, dotIndex + 3);
        } else {
            // 如果没有小数点，则在数字后添加 ".00"
            return numberPart + ".00";
        }
    }
}
