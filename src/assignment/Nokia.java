package assignment;

import java.util.Scanner;

public class Nokia {

    public static void main(String[] args) {

        System.out.println("""
                List of menu functions -
                                
                1. Phone book
                2. Message
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM services
                """);

        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                        Phone book -
                                                
                            1. Search
                            2. Service Nos
                            3. Add name
                            4. Erase
                            5. Edit
                            6. Assi99gn tone
                            7. Send b'card
                            8. Options
                            9. Speed dials
                            10. Voice tags
                        """);
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("""
                            Search -
                                                        
                            0. Back
                            """);
                    case 2 -> System.out.println("""
                            Service Nos. -
                                                        
                            0. Back
                            """);
                    case 3 -> System.out.println("""
                            Add name -
                                                        
                            0. Back
                            """);

                    case 4 -> System.out.println("""
                            Erase -
                                                        
                            0. Back
                            """);

                    case 5 -> System.out.println("""
                            Edit -
                                                        
                            0. Back
                            """);
                    case 6 -> System.out.println("""
                            Assign tone -
                                                       
                            0. Back 
                            """);

                    case 7 -> System.out.println("""
                            Send b'card -
                                                        
                            0. Back
                            """);
                    case 8 -> {
                        System.out.println("""
                                Options -
                                                            
                                1.Type of view
                                2.Memory status
                                                            
                                0. Back
                                """);
                        int optionInput = input.nextInt();
                        switch (optionInput) {
                            case 1 -> System.out.println("""
                                    Type of view -
                                                                        
                                    0. Back
                                    """);
                            case 2 -> System.out.println("""
                                    Memory status -
                                                                        
                                    0. Back
                                    """);
                        }


                    }
                    case 9 -> System.out.println("""
                            Speed dials -
                                                        
                            0. Back
                            """);
                    case 10 -> System.out.println("""
                            Voice tags -
                                                        
                            0. Back
                            """);
                }
            }
            case 2 -> {
                System.out.println("""
                        2. Messages
                            1. Write messages
                            2. Inbox
                            3. Outbox
                            4. Picture messages
                            5. Templates
                            6. Smileys
                            7. Message settings
                            8. Info service
                            9. Voice mailbox number
                            10. Service command edit
                            
                        """);
                int enter = input.nextInt();
                switch (enter) {
                    case 1 -> System.out.println("""
                            Write messages -
                                                        
                            0. Back
                            """);
                    case 2 -> System.out.println("""
                            Inbox -
                                                        
                            0. Back
                            """);

                    case 3 -> System.out.println("""
                            Outbox -
                                                        
                            0. Back
                            """);
                    case 4 -> System.out.println("""
                            Picture messages -
                                                         
                                                         
                            0. Back
                            """);

                    case 5 -> System.out.println("""
                            Templates
                            """);

                    case 6 -> System.out.println("""
                            Smileys
                                                         
                            0. Back
                            """);

                    case 7 -> {
                        System.out.println("""
                                Message settings -
                                                                
                                1. Set 1
                                2. Common
                                                                
                                0. Back
                                """);

                        int setInput = input.nextInt();
                        switch (setInput) {
                            case 1 -> {
                                System.out.println("""
                                        Set 1
                                                                            
                                        1. Message centre number
                                        2. Messages sent as
                                        3. Message validity
                                                                            
                                        0. Back
                                        """);
                                int messageCenterInput = input.nextInt();
                                switch (messageCenterInput){
                                    case 1 -> System.out.println("""
                                           Message
                                           
                                           0. Back
                                           """);
                                    case 2 -> System.out.println("""
                                           Message sent as
                                           
                                           0. Back
                                           """);
                                    case 3 -> System.out.println("""
                                           Message validity
                                           
                                           0. Back
                                           """);
                                }
                            }

                            case 2 -> {
                                System.out.println("""
                                        Common
                                                                            
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support
                                                                            
                                        0. Back
                                        """);
                                int commonInput = input.nextInt();
                                switch (commonInput){
                                    case 1 -> System.out.println("""
                                            Delivery reports
                                            
                                            0. Back
                                            """);
                                    case 2 -> System.out.println("""
                                            Reply via same center
                                            
                                            0. Back
                                            """);
                                    case 3 -> System.out.println("""
                                            Character support
                                            
                                            0. Back
                                            """);
                                }
                            }
                        }
                    }

                    case 8 -> System.out.println("""
                            Info service
                                                         
                            0. Back
                            """);
                    case 9 -> System.out.println("""
                            Voice mailbox number
                                                         
                            0. Back
                            """);

                    case 10 -> System.out.println("""
                            Service command editor
                                                         
                            0. Back
                            """);
                }
            }

            case 3 -> {
                System.out.println("""
                        Chat -
                                                
                        0. Back
                        """);
            }
            case 4 -> {
                System.out.println("""
                        Call register -
                                            
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7.Call cost settings
                        8. Prepaid credit
                                                
                        """);
                int callRegisterInput = input.nextInt();
                switch (callRegisterInput) {
                    case 1 -> System.out.println("""
                            Missed calls
                                                        
                            0. Back
                            """);

                    case 2 -> System.out.println("""
                            Received calls
                                                        
                            0. Back
                            """);
                    case 3 -> System.out.println("""
                            Dialled numbers
                                                        
                            0. Back
                            """);
                    case 4 -> System.out.println("""
                            Erase recent call lists
                                                        
                            0. Back
                            """);
                    case 5 -> {
                        System.out.println("""
                                Show call duration
                                                                
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls' duration
                                4. Dialed calls' duration
                                5. Clear timers
                                                                
                                0. Back
                                """);
                        int showCallInput = input.nextInt();
                        switch (showCallInput) {
                            case 1 -> System.out.println("""
                                     Last call duration
                                                                    
                                    0. Back
                                    """);
                            case 2 -> System.out.println("""
                                    All calls' duration
                                                                        
                                    0. Back
                                    """);
                            case 3 -> System.out.println("""
                                    Received calls' duration
                                                                        
                                    0. Back
                                    """);
                            case 4 -> System.out.println("""
                                    Dialled calls' duration
                                                                        
                                    0. Back
                                    """);
                            case 5 -> {
                                System.out.println("""
                                        Clear timers
                                                                                
                                        0. Back
                                        """);
                            }
                            case 6 -> {
                                System.out.println("""
                                        Show call costs
                                                                                
                                        1. Last call cost
                                        2. All calls' cost
                                        3. Clear counter
                                                                                
                                        """);
                                int lastInput = input.nextInt();
                                switch (lastInput) {
                                    case 1 -> System.out.println("""
                                            Last call cost
                                                                                        
                                            0. Back
                                            """);
                                    case 2 -> System.out.println("""
                                            All calls' cost
                                                                                        
                                            0.
                                            """);
                                    case 3 -> System.out.println("""
                                            Clear counter
                                                                                        
                                            0. Back
                                            """);
                                    case 7 -> {
                                        System.out.println("""
                                                1. Call cost limit
                                                2. Show cost limit
                                                                                                
                                                0.
                                                """);
                                        int callCostInput = input.nextInt();
                                        switch (callCostInput) {
                                            case 1 -> System.out.println("""
                                                    Call cost limit
                                                                                                  
                                                                                                    
                                                    0. Back
                                                    """);
                                            case 2 -> System.out.println("""
                                                    Show cost limit
                                                                                                        
                                                                                                        
                                                    0. Back
                                                    """);
                                            case 8 -> System.out.println("""
                                                    Prepaid credit
                                                                                                        
                                                    0. Back
                                                    """);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }


            case 5 -> {
                System.out.println("""
                        Tones -
                                            
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver
                        """);
                int toneResponse = input.nextInt();
                switch (toneResponse) {
                    case 1 -> System.out.println("""
                            Ringing tone -
                                                        
                            0. Back
                            """);
                    case 2 -> System.out.println("""
                            Ringing volume
                                                        
                            0. Back
                            """);
                    case 3 -> System.out.println("""
                            Incoming call alert
                                                        
                            0. Back
                            """);
                    case 4 -> System.out.println("""
                            Composer
                                                        
                            0. Back
                            """);
                    case 5 -> System.out.println("""
                            Message alert tone
                                                        
                            0.Back
                            """);
                    case 6 -> System.out.println("""
                            Keypad tones
                                                        
                            0. Back
                            """);
                    case 7 -> System.out.println("""
                            Warning and game tones
                                                        
                            0. Back
                            """);
                    case 8 -> System.out.println("""
                            Vibrating alert
                                                        
                            0. Back
                            """);
                    case 9 -> System.out.println("""
                            Screen saver
                                                        
                            0. Back
                            """);
                }
            }
            case 6 -> {
                System.out.println("""
                        Settings -
                                            
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                         """);

                int settingsInput = input.nextInt();
                switch (settingsInput) {
                    case 1 -> {
                        System.out.println("""
                                Call settings
                                                                
                                1. Automatic redial
                                2. Speed dialing
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                                                
                                                                
                                0. Back
                                """);
                        int callInput = input.nextInt();
                        switch (callInput) {
                            case 1 -> System.out.println("""
                                    Automatic redial
                                                                        
                                    0. Back
                                    """);
                            case 2 -> System.out.println("""
                                    Speed dialing
                                                                        
                                    0. Back
                                    """);
                            case 3 -> System.out.println("""
                                    Call waiting options
                                                                        
                                    0. Back
                                    """);
                            case 4 -> System.out.println("""
                                    Own number sending
                                                                        
                                    0. Back
                                    """);
                            case 5 -> System.out.println("""
                                    Phone line in use
                                                                        
                                    0. Back
                                    """);
                            case 6 -> System.out.println("""
                                    Automatic answer
                                                                        
                                    0. Back
                                    """);
                        }
                    }


                    case 2 -> {
                        System.out.println("""
                                Phone settings
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM service actions
                                                                
                                0. Back
                                """);
                        int phoneSettingInput = input.nextInt();
                        switch (phoneSettingInput) {
                            case 1 -> System.out.println("""
                                    Language
                                                                        
                                    0. Back
                                    """);
                            case 2 -> System.out.println("""
                                    Cell info display
                                                                        
                                    0. Back
                                    """);
                            case 3 -> System.out.println("""
                                    Welcome note
                                                                        
                                    0. Back
                                    """);
                            case 4 -> System.out.println("""
                                    Network selection
                                                                        
                                    0. Back
                                    """);
                            case 5 -> System.out.println("""
                                    Lights
                                     
                                     0. Back
                                     """);
                            case 6 -> System.out.println("""
                                    Confirm SIM service actions
                                    
                                    0. Back
                                    """);
                        }
                    }


                    case 3 -> {
                        System.out.println("""
                                Security settings
                                                                
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                                                                                           
                                0. Back
                                """);
                        int securityInput = input.nextInt();
                        switch (securityInput) {
                            case 1 -> System.out.println("""
                                    PIN code request
                                                                        
                                    0. Back
                                    """);
                            case 2 -> System.out.println("""
                                    Call barring service
                                                                        
                                    0. Back
                                    """);
                            case 3 -> System.out.println("""
                                    Fixed dialling
                                                                        
                                    0. Back
                                    """);
                            case 4 -> System.out.println("""
                                    Closed user group
                                                                        
                                    0. Back
                                    """);
                            case 5 -> System.out.println("""
                                    Phone security
                                    
                                    0. Back 
                                    """);
                            case 6 -> System.out.println("""
                                    Change access codes
                                    
                                    0. Back
                                    """);
                        }
                    }

                    case 4 -> System.out.println("""
                            Restore factory settings
                                                        
                                                        
                            0. Back
                            """);
                }
            }

            case 7 -> {
                System.out.println("""
                        Call divert -
                                                
                        0. Back
                        """);
            }

            case 8 -> {
                System.out.println("""
                        Games -
                                                
                        0. Back
                        """);
            }

            case 9 -> {
                System.out.println("""
                        Calculator -
                                                
                        0. Back
                        """);
            }

            case 10 -> {
                System.out.println("""
                        Remainders
                                                
                        0. Back
                        """);
            }

            case 11 -> {
                System.out.println("""
                        Clock
                                                
                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                                                
                        """);
                int clockInput = input.nextInt();
                switch (clockInput) {
                    case 1 -> System.out.println("""
                            1. Alarm clock
                                                        
                            0. Back
                            """);
                    case 2 -> System.out.println("""
                            Clock setting
                                                        
                            0. Back
                            """);
                    case 3 -> System.out.println("""
                            Date setting
                                                        
                            0. Back
                            """);
                    case 4 -> System.out.println("""
                            Stopwatch
                                                        
                            0. Back
                            """);
                    case 5 -> System.out.println("""
                            Countdown timer
                                                        
                            0. Back
                            """);
                    case 6 -> System.out.println("""
                            Auto update of date and time
                                                        
                            0. Back
                            """);
                }
            }

            case 12 -> {
                System.out.println("""
                        Profiles
                                                
                        0. Back
                        """);
            }

            case 13 -> {
                System.out.println("""
                        SIM services
                                                
                        0. Back
                        """);
            }
        }
    }
}
