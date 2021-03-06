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
 
package net.chrisrichardson.foodToGo.placeOrderTransactionScripts;

import java.util.*;

import net.chrisrichardson.foodToGo.placeOrderTransactionScripts.details.*;

public class PlaceOrderResultFactoryImpl implements PlaceOrderResultFactory {

    public UpdateDeliveryInfoResult makeUpdateDeliveryInfoResult(
            int statusCode, PendingOrderDTO pendingOrder,
            PendingOrderTotals totals, List availableRestaurants) {
        pendingOrder.setTotals(totals);
        return new UpdateDeliveryInfoResult(statusCode, pendingOrder,
                availableRestaurants);
    }

    public UpdateDeliveryInfoResult makeUpdateDeliveryInfoResult_simple(
            int statusCode, PendingOrderDTO pendingOrder,
            List availableRestaurants) {
        return new UpdateDeliveryInfoResult(statusCode, pendingOrder,
                availableRestaurants);
    }

}