public class Main {


    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode result = solution.mergeTwoLists(
                new ListNode(1, new ListNode(2, new ListNode(3))),
                new ListNode(1, new ListNode(2, new ListNode(3)))
        );

        System.out.println(result.val);


    }


}