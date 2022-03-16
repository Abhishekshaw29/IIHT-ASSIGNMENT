package assignment3;
public class Customer {
	
	private String Name;
	private String Mobile;
	private double feedbackRating;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public double getFeedbackRating() {
		return feedbackRating;
	}
	public void setFeedbackRating(double feedbackRating) {
		this.feedbackRating = feedbackRating;
	}
	public Customer(String name, String mobile, double feedbackRating) {
		super();
		this.Name = name;
		this.Mobile = mobile;
		this.feedbackRating = feedbackRating;
	}
	
	
}
