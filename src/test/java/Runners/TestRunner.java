/**
 * @Author:Otosun Tarih :15/10/2020
 */
package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Runner Classlar ne için kullanılır: Belirli veya grupladığımı testleri toplu olarak çalıştırma imkanı veriri.
 * Bunun için;
 * 1- Java Class açılır.
 * 2- AbstractTestNGCucumberTests  extend alınır.Böylece RUN özelliği kazanır
 * 3- Class a   @CucumberOptions annotition ı eklenrek , buraya parametreleri verilerek kullanılır.
 * Genel olarak TestNG deki XML i olarak düşünebilirsiniz.
 *
 * SmokeTest : En genel manada ana unsurları test etme.
 * RegressionTest : Bütün birimleri uyumlu şekilde çalışma test
 */

@CucumberOptions(
        features = {"src/test/java/FeaturesFiles"},//buraya feature files in pathi verilecek.
        glue = {"StepDefinitions"}, // Step definationsin klasoru yaziliyor
        dryRun = false  // true olduğunda testi çalıştırma sadece feature lara ait steplerin varlığını kontrol eder.

)


public class TestRunner extends AbstractTestNGCucumberTests {




}
