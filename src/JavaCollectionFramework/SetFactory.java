/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaCollectionFramework;

import java.util.*;

/**
 *
 * @author Kevin
 */
public class SetFactory {
    
    public Set getSet(int entry){
        switch (entry) {
            case 1:
                return new HashSet<>();
            case 2:
                return new TreeSet<>();
            default:
                return new LinkedHashSet<>();
        }
    }
    
}
