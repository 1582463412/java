public class GeneralManager extends Leader {
    public GeneralManager(String name)
    {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if (request.getLeaveDays()<30)
        {
            System.out.println("莫非"+request.getLeaveName()+"想辞职，居然请假"+request.getLeaveDays()+"天。");
        }
    }
}
