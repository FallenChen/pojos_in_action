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
 


package net.chrisrichardson.foodToGo.util;
import java.util.*;

public class PagedQueryResult {

    private final List results;

    private final boolean more;

    public PagedQueryResult(List results, boolean more) {
        this.results = results;
        this.more = more;
    }

    public boolean isMore() {
        return more;
    }

    public List getResults() {
        return results;
    }
}