/*
 * Copyright (c) 2005 Chris Richardson
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 


package net.chrisrichardson.foodToGo.ejb3.domain;


public interface PlaceOrderStatusCodes {

    public static final int OK = 99;
    public static final int CONFIRM_CHANGE = 1;
    public static final int INVALID_DELIVERY_INFO = 2;
    public static final int DOES_NOT_MEET_MINIMUM = 3;
    

}
