/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2009 Sun Microsystems, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Contributor(s):
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2006 Sun
 * Microsystems, Inc. All Rights Reserved.
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 */

package simple;


/**
 *
 * @author
 */
public class CPU {
    //~ Constructors -------------------------------------------------------------------------------------------------------------

    /**
     * Creates a new instance of CPU
     */
    public CPU() {
    }

    //~ Methods ------------------------------------------------------------------------------------------------------------------

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("Application (20070815) started: " + System.currentTimeMillis());

            for (int i = 0; i < 5; i++) {
                test1000();
            }

            double[] fibo = new double[100];
            fibo[0] = 0;
            fibo[1] = 1;

            for (int i = 2; i < 100; i++) {
                fibo[i] = fibo[i - 2] + fibo[i - 1];
            }

            System.out.println("Fibonacci:");
            System.out.print("[");

            for (int i = 0; i < 100; i++) {
                System.out.print(fibo[i]);

                if (i < 99) {
                    System.out.print(",");
                }
            }

            System.out.println("]");
            System.out.println("Application finished: " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void test1000() {
        long startTime = System.currentTimeMillis();

        while ((System.currentTimeMillis() - startTime) < 1000) {
            ;
        }

        test500();
    }

    private static void test20() {
        long startTime = System.currentTimeMillis();

        while ((System.currentTimeMillis() - startTime) < 20) {
            ;
        }
    }

    private static void test500() {
        long startTime = System.currentTimeMillis();

        while ((System.currentTimeMillis() - startTime) < 500) {
            ;
        }

        test20();
    }
}
