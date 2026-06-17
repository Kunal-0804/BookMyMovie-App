package entity;
/*
 * User Entity Class
 * This class stores user information required for
 * movie ticket booking in the BookMyMovie application.
 */
public class User {
        private int userId;
        private String name;
        private String email;
        private String phone;
/*
     * Parameterized Constructor
     * Initializes user details.
     *
     * @param userId Unique user ID
     * @param name User's name
     * @param email User's email address
     * @param phone User's phone number
     */
        public User(int userId, String name, String email, String phone) {
            this.userId = userId;
            this.name = name;
            this.email = email;
            this.phone = phone;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }
