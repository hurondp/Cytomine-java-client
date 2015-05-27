package be.cytomine.client.sample;
/*
 * Copyright (c) 2009-2015. Authors: see NOTICE file.
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

import be.cytomine.client.Cytomine;
import be.cytomine.client.CytomineException;
import be.cytomine.client.models.JobParameter;
import be.cytomine.client.models.JobTemplate;
import be.cytomine.client.models.Software;
import org.apache.log4j.Logger;

public class SoftwareExample {

    private static final Logger log = Logger.getLogger(SoftwareExample.class);

    public static void addSoftwareTestArea(Cytomine cytomine) throws Exception {
        try {
            Software software = cytomine.addSoftware("ComputeAnnotationStat", "computeAnnotationStatService", "DownloadFiles", "groovy -cp algo/computeAnnotationStats/Cytomine-Java-Client.jar:algo/computeAnnotationStats/jts-1.13.jar algo/computeAnnotationStats/computeAnnotationStats.groovy");

            /**
             * 0: type (=> cytomine) or standalone if execute with ide/java -jar  => STRING
             * 1: public key
             * 2: private key
             * 3: N value
             * 4: T value
             * 5: Working dir
             * 6: Cytomine Host
             * 7: Force download crop (even if already exist) => BOOLEAN
             * 8: storeName (KYOTOSINGLEFILE)
             * 9: index project (list: x,y,z)
             * 10: search project (only one)
             */
            cytomine.addSoftwareParameter("execType", "String", software.getId(), "cytomine", false, 100);
            cytomine.addSoftwareParameter("annotation", "Number", software.getId(), "", true, 200);
            cytomine.addSoftwareParameter("term", "Number", software.getId(), "", true, 300);

        } catch (CytomineException e) {
            log.error(e);
        }
    }


    public static void testAddJobTemplate(Cytomine cytomine) throws Exception {
        JobTemplate jobTemplate = cytomine.addJobTemplate("ComputeAnnotationStat", 57L, 900532L);
        JobParameter jobParameter1 = cytomine.addJobParameter(jobTemplate.getId(), 900556L, "20202");
        JobParameter jobParameter2 = cytomine.addJobParameter(jobTemplate.getId(), 900562L, "456");
    }


    public static void addSoftwareTest(Cytomine cytomine) throws Exception {
        try {
            Software software = cytomine.addSoftware("SoftwareTest", "retrievalSuggestedTermJobService", "ValidateAnnotation", "");

            /**
             * 0: type (=> cytomine) or standalone if execute with ide/java -jar  => STRING
             * 1: public key
             * 2: private key
             * 3: N value
             * 4: T value
             * 5: Working dir
             * 6: Cytomine Host
             * 7: Force download crop (even if already exist) => BOOLEAN
             * 8: storeName (KYOTOSINGLEFILE)
             * 9: index project (list: x,y,z)
             * 10: search project (only one)
             */
            cytomine.addSoftwareParameter("execType", "String", software.getId(), "cytomine", false, 100);
               cytomine.addSoftwareParameter("publicKey", "String", software.getId(), "", true, 200);
               cytomine.addSoftwareParameter("privateKey", "String", software.getId(), "", true, 300);
               cytomine.addSoftwareParameter("N", "Number", software.getId(), "500", false, 400);
               cytomine.addSoftwareParameter("T", "Number", software.getId(), "5", false, 500);
               cytomine.addSoftwareParameter("workingDir", "String", software.getId(), "algo/retrievalSuggest/suggest/", true, 600);
               cytomine.addSoftwareParameter("cytomineHost", "String", software.getId(), "$cytomineHost$", true, 700);
               cytomine.addSoftwareParameter("forceDownloadCrop", "Boolean", software.getId(), "false", false, 800);
               cytomine.addSoftwareParameter("storeName", "String", software.getId(), "KYOTOSINGLEFILE", false, 900);
               cytomine.addSoftwareParameter("indexProject", "ListDomain", software.getId(), "$currentProject$", true, 1000, "/api/ontology/$currentOntology$/project.json", "name", "name");
               cytomine.addSoftwareParameter("searchProject", "Domain", software.getId(), "$currentProject$", true, 1100, "/api/ontology/$currentOntology$/project.json", "name", "name");

               cytomine.addSoftwareProject(software.getId(), 67L);
               cytomine.addSoftwareProject(software.getId(), 716498L);
               cytomine.addSoftwareProject(software.getId(), 75985L);

        } catch (CytomineException e) {
            log.error(e);
        }
    }

    public static void addSoftwareProject(Cytomine cytomine) throws Exception {
        cytomine.addSoftwareProject(485324L, 75985L);
    }

    public static void addSoftwareRetrieval(Cytomine cytomine) throws Exception {
        try {
            Software software = cytomine.addSoftware("Retrieval-Suggest-Term", "retrievalSuggestedTermJobService", "ValidateAnnotation", "");

            /**
             * 0: type (=> cytomine) or standalone if execute with ide/java -jar  => STRING
             * 1: public key
             * 2: private key
             * 3: N value
             * 4: T value
             * 5: Working dir
             * 6: Cytomine Host
             * 7: Force download crop (even if already exist) => BOOLEAN
             * 8: storeName (KYOTOSINGLEFILE)
             * 9: index project (list: x,y,z)
             * 10: search project (only one)
             */
            cytomine.addSoftwareParameter("execType", "String", software.getId(), "cytomine", false, 100);
            cytomine.addSoftwareParameter("publicKey", "String", software.getId(), "", true, 200);
            cytomine.addSoftwareParameter("privateKey", "String", software.getId(), "", true, 300);
            cytomine.addSoftwareParameter("N", "Number", software.getId(), "500", false, 400);
            cytomine.addSoftwareParameter("T", "Number", software.getId(), "5", false, 500);
            cytomine.addSoftwareParameter("workingDir", "String", software.getId(), "algo/retrievalSuggest/suggest/", true, 600);
            cytomine.addSoftwareParameter("cytomineHost", "String", software.getId(), "$cytomineHost$", true, 700);
            cytomine.addSoftwareParameter("forceDownloadCrop", "Boolean", software.getId(), "false", false, 800);
            cytomine.addSoftwareParameter("storeName", "String", software.getId(), "KYOTOSINGLEFILE", false, 900);
            cytomine.addSoftwareParameter("indexProject", "ListDomain", software.getId(), "$currentProject$", true, 1000, "/api/ontology/$currentOntology$/project.json", "name", "name");
            cytomine.addSoftwareParameter("searchProject", "Domain", software.getId(), "$currentProject$", true, 1100, "/api/ontology/$currentOntology$/project.json", "name", "name");

            cytomine.addSoftwareProject(software.getId(), 67L);
            cytomine.addSoftwareProject(software.getId(), 716498L);
            cytomine.addSoftwareProject(software.getId(), 75985L);

        } catch (CytomineException e) {
            log.error(e);
        }
    }

    public static void addSoftwareRetrievalEvolution(Cytomine cytomine) throws Exception {
        try {
            Software software = cytomine.addSoftware("Retrieval-Evolution", "retrievalEvolutionJobService", "ValidateEvolution", "");

            /**
             * 0: type (=> cytomine) or standalone if execute with ide/java -jar  => STRING
             * 1: public key
             * 2: private key
             * 3: N value
             * 4: T value
             * 5: Working dir
             * 6: Cytomine Host
             * 7: Force download crop (even if already exist) => BOOLEAN
             * 8: storeName (KYOTOSINGLEFILE)
             * 9: index project (list: x,y,z)
             * 10: search project (only one)
             */
            cytomine.addSoftwareParameter("execType", "String", software.getId(), "cytomine", false, 100);
            cytomine.addSoftwareParameter("publicKey", "String", software.getId(), "", true, 200);
            cytomine.addSoftwareParameter("privateKey", "String", software.getId(), "", true, 300);
            cytomine.addSoftwareParameter("N", "Number", software.getId(), "500", false, 400);
            cytomine.addSoftwareParameter("T", "Number", software.getId(), "5", false, 500);
            cytomine.addSoftwareParameter("workingDir", "String", software.getId(), "algo/retrievalSuggest/suggest/", true, 600);
            cytomine.addSoftwareParameter("cytomineHost", "String", software.getId(), "$cytomineHost$", true, 700);
            cytomine.addSoftwareParameter("forceDownloadCrop", "Boolean", software.getId(), "false", false, 800);
            cytomine.addSoftwareParameter("storeName", "String", software.getId(), "KYOTOSINGLEFILE", false, 900);
            cytomine.addSoftwareParameter("indexProject", "ListDomain", software.getId(), "$currentProject$", true, 1000, "/api/ontology/$currentOntology$/project.json", "name", "name");
            cytomine.addSoftwareParameter("searchProject", "Domain", software.getId(), "$currentProject$", true, 1100, "/api/ontology/$currentOntology$/project.json", "name", "name");
            cytomine.addSoftwareParameter("dateStart", "Date", software.getId(), "$currentProjectCreationDate$", true, 1200);
            cytomine.addSoftwareParameter("dateStop", "Date", software.getId(), "$currentDate$", true, 1300);
            cytomine.addSoftwareParameter("dateIncr", "String", software.getId(), "MONTH+1", true, 1400);
            cytomine.addSoftwareProject(software.getId(), 67L);
            cytomine.addSoftwareProject(software.getId(), 716498L);
            cytomine.addSoftwareProject(software.getId(), 75985L);

        } catch (CytomineException e) {
            log.error(e);
        }
    }

    public static void addSoftwareComputeAreaOld(Cytomine cytomine) throws Exception {
        try {
            Software software = cytomine.addSoftware("ComputeTermAreaOld", "computeTermAreaJobService", "DownloadFiles", "");
            cytomine.addSoftwareParameter("cytomineHost", "String", software.getId(), "$cytomineHost$", true, 100);
            cytomine.addSoftwareParameter("publicKey", "String", software.getId(), "", true, 200);
            cytomine.addSoftwareParameter("privateKey", "String", software.getId(), "", true, 300);
            cytomine.addSoftwareParameter("Terms", "ListDomain", software.getId(), "", true, 400, "/api/project/$currentProject$/term.json", "name", "name");
            cytomine.addSoftwareParameter("Images", "ListDomain", software.getId(), "", true, 500, "/api/project/$currentProject$/imageinstance.json", "filename", "filename");

        } catch (CytomineException e) {
            log.error(e);
        }
    }

    public static void addSoftwareComputeArea(Cytomine cytomine) throws Exception {
        try {
            Software software = cytomine.addSoftware("ComputeTermArea", "createRabbitJobService", "DownloadFiles",
                    "groovy -cp algo/computeAnnotationStats/Cytomine-Java-Client.jar:algo/computeAnnotationStats/jts-1.13.jar algo/computeAnnotationStats/computeAnnotationStats.groovy");
            cytomine.addSoftwareParameter("host", "String", software.getId(), "$cytomineHost$", true, 100);
            cytomine.addSoftwareParameter("publicKey", "String", software.getId(), "", true, 200);
            cytomine.addSoftwareParameter("privateKey", "String", software.getId(), "", true, 300);
            cytomine.addSoftwareParameter("annotation", "Domain", software.getId(), "", true, 400);
            cytomine.addSoftwareParameter("term", "Domain", software.getId(), "", true, 500);

        } catch (CytomineException e) {
            log.error(e);
        }
    }

    public static void addSoftwareTissueDetect(Cytomine cytomine) throws Exception {
        try{
            Software software = cytomine.addSoftware("TissueDetect", "createRabbitJobWithArgsService", "ValidateAnnotation",
                    "python algo/detect_sample/detect_sample.py --cytomine_host $host --cytomine_public_key $publicKey --cytomine_private_key $privateKey " +
                            "--cytomine_base_path /api/ " +
                            "--cytomine_working_path /software_router/algo/detect_sample/ " +
                            "--cytomine_id_software $cytomine_id_software " +
                            "--cytomine_id_project $cytomine_id_project " +
                            "--cytomine_predict_term $cytomine_predict_term " +
                            "--cytomine_max_image_size $cytomine_max_image_size " +
                            "--cytomine_erode_iterations $cytomine_erode_iterations " +
                            "--cytomine_dilate_iterations $cytomine_dilate_iterations " +
                            "--cytomine_athreshold_blocksize $cytomine_athreshold_blocksize " +
                            "--cytomine_athreshold_constant $cytomine_athreshold_constant ");


            // set by server
            cytomine.addSoftwareParameter("cytomine_id_software", "Number", software.getId(), "", true, 400, null, null, null, true);
            cytomine.addSoftwareParameter("cytomine_id_project", "Number", software.getId(), "", true, 500, null, null, null, true);
            // set by user
            cytomine.addSoftwareParameter("cytomine_predict_term", "Number", software.getId(), "", true, 600);
            cytomine.addSoftwareParameter("cytomine_max_image_size", "Number", software.getId(), "0", true, 700);
            cytomine.addSoftwareParameter("cytomine_erode_iterations", "Number", software.getId(), "0", true, 800);
            cytomine.addSoftwareParameter("cytomine_dilate_iterations", "Number", software.getId(), "0", true, 900);
            cytomine.addSoftwareParameter("cytomine_athreshold_blocksize", "Number", software.getId(), "0", true, 1000);
            cytomine.addSoftwareParameter("cytomine_athreshold_constant", "Number", software.getId(), "0", true, 1100);
        } catch (CytomineException e) {
            log.error(e);
        }
    }


    public static void addSoftwareTissueSegmentBuilder(Cytomine cytomine) throws Exception {
        try{
            Software software = cytomine.addSoftware("3Pyxit_SegmentationModel_Builder", "createRabbitJobWithArgsService", "ValidateAnnotation",
                    "python algo/segmentation_model_builder/add_and_run_job.py " +
                            "--cytomine_host $host " +
                            "--cytomine_public_key $publicKey " +
                            "--cytomine_private_key $privateKey " +
                            "--cytomine_base_path /api/ " +
                            "--cytomine_id_software $cytomine_id_software " +
                            "--cytomine_working_path algo/segmentation_model_builder/ " +
                            "--cytomine_id_project $cytomine_id_project " +
                            "--cytomine_annotation_projects $cytomine_annotation_projects " +
                            "-z $zoom " +
                            "--cytomine_predict_terms $cytomine_predict_terms " +
                            "--cytomine_excluded_terms $cytomine_excluded_terms " +
                            "--pyxit_target_width $pyxit_target_width " +
                            "--pyxit_target_height $pyxit_target_height " +
                            "--pyxit_colorspace $pyxit_colorspace " +
                            "--pyxit_n_jobs $pyxit_n_jobs " +
                            "--pyxit_save_to $pyxit_save_to " +
                            "--pyxit_transpose $pyxit_transpose " +
                            "--pyxit_fixed_size $pyxit_fixed_size " +
                            "--pyxit_interpolation $pyxit_interpolation " +
                            "--forest_n_estimators $forest_n_estimators " +
                            "--forest_max_features $forest_max_features " +
                            "--forest_min_samples_split $forest_min_samples_split " +
                            "--pyxit_n_subwindows $pyxit_n_subwindows " +
                            "--verbose ");


            // set by server
            cytomine.addSoftwareParameter("cytomine_id_software", "Number", software.getId(), "", true, 400, null, null, null, true);
            cytomine.addSoftwareParameter("cytomine_id_project", "Number", software.getId(), "", true, 500, null, null, null, true);
            cytomine.addSoftwareParameter("pyxit_save_to", "String", software.getId(), "algo/segmentation_model_builder/logs/segmentation_tumor_model.pkl", true, 1600, null, null, null, true);
            // set by user
            cytomine.addSoftwareParameter("cytomine_annotation_projects", "List", software.getId(), "", true, 600); // ???
            cytomine.addSoftwareParameter("zoom", "Number", software.getId(), "0", true, 700); // ???
            cytomine.addSoftwareParameter("cytomine_predict_terms", "List", software.getId(), "", true, 800);// ???
            cytomine.addSoftwareParameter("cytomine_excluded_terms", "List", software.getId(), "", true, 900);// ???
            cytomine.addSoftwareParameter("pyxit_target_width", "Number", software.getId(), "16", true, 1000);
            cytomine.addSoftwareParameter("pyxit_target_height", "Number", software.getId(), "16", true, 1100);
            cytomine.addSoftwareParameter("pyxit_colorspace", "Number", software.getId(), "2", true, 1200);
            cytomine.addSoftwareParameter("pyxit_n_jobs", "Number", software.getId(), "-1", true, 1300);
            cytomine.addSoftwareParameter("pyxit_transpose", "Boolean", software.getId(), "true", false, 1500);
            cytomine.addSoftwareParameter("pyxit_fixed_size", "Boolean", software.getId(), "true", false, 1600);
            cytomine.addSoftwareParameter("pyxit_interpolation", "Number", software.getId(), "2", false, 1700);
            cytomine.addSoftwareParameter("forest_n_estimators", "Number", software.getId(), "10", true, 1800);
            cytomine.addSoftwareParameter("forest_max_features", "Number", software.getId(), "1", true, 1900);
            cytomine.addSoftwareParameter("forest_min_samples_split", "Number", software.getId(), "1", true, 2000);
            cytomine.addSoftwareParameter("pyxit_n_subwindows", "Number", software.getId(), "10", true, 2100);

        } catch (CytomineException e) {
            log.error(e);
        }
    }



    public static void addSoftwareEasyTissueSegmentBuilder(Cytomine cytomine) throws Exception {
        try{

            Software software = cytomine.addSoftware("Easy_3Pyxit_SegmentationModel_Builder_4", "createRabbitJobWithArgsService", "ValidateAnnotation",
                    "python algo/segmentation_model_builder/add_and_run_job.py " +
                            "--cytomine_host $host " +
                            "--cytomine_public_key $publicKey " +
                            "--cytomine_private_key $privateKey " +
                            "--cytomine_base_path /api/ " +
                            "--cytomine_id_software $cytomine_id_software " +
                            "--cytomine_working_path algo/segmentation_model_builder/ " +
                            "--cytomine_id_project $cytomine_id_project " +
                            "--cytomine_annotation_projects $cytomine_annotation_projects " +
                            "-z $zoom " +
                            "--cytomine_predict_terms $cytomine_predict_terms " +
                            "--cytomine_excluded_terms $cytomine_excluded_terms " +
                            "--pyxit_target_width $pyxit_target_width " +
                            "--pyxit_target_height $pyxit_target_height " +
                            "--pyxit_colorspace $pyxit_colorspace " +
                            "--pyxit_n_jobs $pyxit_n_jobs " +
                            "--pyxit_save_to $pyxit_save_to " +
                            "--pyxit_transpose $pyxit_transpose " +
                            "--pyxit_fixed_size $pyxit_fixed_size " +
                            "--pyxit_interpolation $pyxit_interpolation " +
                            "--forest_n_estimators $forest_n_estimators " +
                            "--forest_max_features $forest_max_features " +
                            "--forest_min_samples_split $forest_min_samples_split " +
                            "--pyxit_n_subwindows $pyxit_n_subwindows " +
                            "--verbose ");


            // set by server
            cytomine.addSoftwareParameter("cytomine_id_software", "Number", software.getId(), "", true, 400, null, null, null, true);
            cytomine.addSoftwareParameter("cytomine_id_project", "Number", software.getId(), "", true, 500, null, null, null, true);
            cytomine.addSoftwareParameter("pyxit_save_to", "String", software.getId(), "algo/segmentation_model_builder/logs/segmentation_tumor_model.pkl", true, 1600, null, null, null, true);
            // set by user
            cytomine.addSoftwareParameter("cytomine_annotation_projects", "List", software.getId(), "160436450", true, 600); // ???
            cytomine.addSoftwareParameter("zoom", "Number", software.getId(), "0", true, 700); // ???
            cytomine.addSoftwareParameter("cytomine_predict_terms", "List", software.getId(), "20202", true, 800);// ???
            cytomine.addSoftwareParameter("cytomine_excluded_terms", "List", software.getId(), "5735", true, 900);// ???
            cytomine.addSoftwareParameter("pyxit_target_width", "Number", software.getId(), "24", true, 1000);
            cytomine.addSoftwareParameter("pyxit_target_height", "Number", software.getId(), "24", true, 1100);
            cytomine.addSoftwareParameter("pyxit_colorspace", "Number", software.getId(), "2", true, 1200);
            cytomine.addSoftwareParameter("pyxit_n_jobs", "Number", software.getId(), "10", true, 1300);
            cytomine.addSoftwareParameter("pyxit_transpose", "Boolean", software.getId(), "true", false, 1500);
            cytomine.addSoftwareParameter("pyxit_fixed_size", "Boolean", software.getId(), "true", false, 1600);
            cytomine.addSoftwareParameter("pyxit_interpolation", "Number", software.getId(), "1", false, 1700);
            cytomine.addSoftwareParameter("forest_n_estimators", "Number", software.getId(), "10", true, 1800);
            cytomine.addSoftwareParameter("forest_max_features", "Number", software.getId(), "28", true, 1900);
            cytomine.addSoftwareParameter("forest_min_samples_split", "Number", software.getId(), "2", true, 2000);
            cytomine.addSoftwareParameter("pyxit_n_subwindows", "Number", software.getId(), "1000", true, 2100);
        } catch (CytomineException e) {
            log.error(e);
        }
    }

// NOT TESTED
    public static void addSoftwareTissueSegmentPrediction(Cytomine cytomine) throws Exception {
        try{
            Software software = cytomine.addSoftware("Segmentation_Model_Predict", "createRabbitJobWithArgsService", "ValidateAnnotation",
                    "python algo/segmentation_prediction/image_prediction_wholeslide.py " +
                            "--cytomine_host $host " +
                            "--cytomine_public_key $public_key " +
                            "--cytomine_private_key $private_key " +
                            "--cytomine_base_path /api/ " +
                            "--cytomine_id_software $software " +
                            "--cytomine_working_path algo/segmentation_prediction/ " +
                            "--cytomine_id_project $id_project " +
                            "-i $image " +
                            "-z $cytomine_zoom_level " +
                            "-t $cytomine_tile_size " +
                            "--cytomine_tile_min_stddev $cytomine_tile_min_stddev " +
                            "--cytomine_tile_max_mean $cytomine_tile_max_mean " +
                            "--startx $cytomine_startx " +
                            "--starty $cytomine_starty " +
                            "-j $cytomine_nb_jobs " +
                            "--cytomine_predict_term $cytomine_predict_step " +
                            "--cytomine_roi_term $cytomine_roi_term " +
                            "--pyxit_target_width $pyxit_target_width " +
                            "--pyxit_target_height $pyxit_target_height " +
                            "--pyxit_colorspace $pyxit_colorspace " +
                            "--pyxit_n_jobs $pyxit_nb_jobs " +
                            "--pyxit_save_to $pyxit_save_to " +
                            "--cytomine_predict_step $cytomine_predict_step " +

                            "--cytomine_union " + // can be changed by end users ?
                            "--cytomine_postproc " + // can be changed by end users ?

                            "--cytomine_min_size $cytomine_min_size " +
                            "--cytomine_union_min_length $cytomine_union_min_length " +
                            "--cytomine_union_bufferoverlap $cytomine_union_bufferoverlap " +
                            "--cytomine_union_area $cytomine_union_area " +
                            "--cytomine_union_min_point_for_simplify $cytomine_union_min_point_for_simplify " +
                            "--cytomine_union_min_point $cytomine_union_min_point " +
                            "--cytomine_union_max_point $cytomine_union_max_point " +
                            "--cytomine_union_nb_zones_width $cytomine_union_nb_zones_width " +
                            "--cytomine_union_nb_zones_height $cytomine_union_nb_zones_height " +

                            "$cytomine_mask_internal_holes " + // --cytomine_mask_internal_holes
                            "--cytomine_count " + // can be changed by end users ?

                            "--cytomine_max_size $cytomine_max_size " +
                            "--pyxit_post_classification $pyxit_post_classification " +
                            "--pyxit_post_classification_save_to $pyxit_post_classification_save_to ");


            // set by server
            cytomine.addSoftwareParameter("cytomine_id_software", "Number", software.getId(), "", true, 500, null, null, null, true);
            cytomine.addSoftwareParameter("cytomine_id_project", "Number", software.getId(), "", true, 600, null, null, null, true);
            cytomine.addSoftwareParameter("pyxit_save_to", "String", software.getId(), "algo/segmentation_prediction/logs/segmentation_tumor_model.pkl", true, 700, null, null, null, true);
            // set by user
            cytomine.addSoftwareParameter("cytomine_zoom_level", "Number", software.getId(), "0", true, 800);
            cytomine.addSoftwareParameter("pyxit_target_width", "Number", software.getId(), "24", true, 900);
            cytomine.addSoftwareParameter("pyxit_target_height", "Number", software.getId(), "24", true, 1000);
            cytomine.addSoftwareParameter("pyxit_colorspace", "Number", software.getId(), "2", true, 1100);
            cytomine.addSoftwareParameter("cytomine_tile_size", "Number", software.getId(), "512", true, 1200);
            cytomine.addSoftwareParameter("cytomine_tile_min_stddev", "Number", software.getId(), "5", true, 1300);
            cytomine.addSoftwareParameter("cytomine_tile_max_mean", "Number", software.getId(), "250", true, 1400);
            cytomine.addSoftwareParameter("cytomine_startx", "Number", software.getId(), "0", true, 1500);
            cytomine.addSoftwareParameter("cytomine_starty", "Number", software.getId(), "0", true, 1600);
            cytomine.addSoftwareParameter("cytomine_roi_term", "Number", software.getId(), "0", true, 1700);
            cytomine.addSoftwareParameter("cytomine_predict_step", "Number", software.getId(), "4", true, 1800);
            cytomine.addSoftwareParameter("cytomine_min_size", "Number", software.getId(), "1000", true, 1900);
            cytomine.addSoftwareParameter("cytomine_max_size", "Number", software.getId(), "10000000", true, 2000);
            cytomine.addSoftwareParameter("cytomine_union_min_length", "Number", software.getId(), "10", true, 2100);
            cytomine.addSoftwareParameter("cytomine_union_bufferoverlap", "Number", software.getId(), "5", true, 2200);
            cytomine.addSoftwareParameter("cytomine_union_area", "Number", software.getId(), "5000", true, 2300);
            cytomine.addSoftwareParameter("cytomine_union_min_point_for_simplify", "Number", software.getId(), "1000", true, 2400);
            cytomine.addSoftwareParameter("cytomine_union_min_point", "Number", software.getId(), "500", true, 2500);
            cytomine.addSoftwareParameter("cytomine_union_max_point", "Number", software.getId(), "1000", true, 2600);
            cytomine.addSoftwareParameter("cytomine_union_nb_zones_width", "Number", software.getId(), "5", true, 2700);
            cytomine.addSoftwareParameter("cytomine_union_nb_zones_height", "Number", software.getId(), "5", true, 2800);
            cytomine.addSoftwareParameter("pyxit_post_classification", "Boolean", software.getId(), "true", true, 3000);
            cytomine.addSoftwareParameter("pyxit_post_classification_save_to", "String", software.getId(), "/tmp", true, 3100);
            cytomine.addSoftwareParameter("image", "Number", software.getId(), "", true, 3200);
            cytomine.addSoftwareParameter("cytomine_nb_jobs", "Number", software.getId(), "10", true, 3300);
            cytomine.addSoftwareParameter("pyxit_nb_jobs", "Number", software.getId(), "10", true, 3400);
            // parameters without value
            cytomine.addSoftwareParameter("cytomine_mask_internal_holes", "String", software.getId(), "--cytomine_mask_internal_holes", true, 3500);


        } catch (CytomineException e) {
            log.error(e);
        }
    }

    // NOT TESTED
    public static void addSoftwareCellClassifierBuilder(Cytomine cytomine) throws Exception {
        try{

            Software software = cytomine.addSoftware("Cell_Classifier_Builder", "createRabbitJobWithArgsService", "ValidateAnnotation",
                    "python algo/object_finder/image_wholeslide_objectfinder.py " +
                            "--cytomine_host $host " +
                            "--cytomine_public_key $public_key " +
                            "--cytomine_private_key $private_key " +
                            "--cytomine_base_path /api/ " +
                            "--cytomine_working_path algo/object_finder/ " +
                            "--cytomine_id_software $cytomine_id_software " +
                            "--cytomine_id_project $cytomine_id_project  " +
                            "--cytomine_id_image $cytomine_id_image " +
                            "--cytomine_tile_size $cytomine_tile_size " +
                            "--cytomine_zoom_level $cytomine_zoom_level " +
                            "--cytomine_tile_overlap $cytomine_tile_overlap " +
                            "--cytomine_filter $cytomine_filter " +
                            "--cytomine_union_min_length $cytomine_union_minlength " +
                            "--cytomine_union_bufferoverlap $cytomine_union_bufferoverlap " +
                            "--cytomine_union_area $cytomine_union_area " +
                            "--cytomine_union_min_point_for_simplify $cytomine_union_min_point_for_simplify  " +
                            "--cytomine_union_min_point $cytomine_union_min_point " +
                            "--cytomine_union_max_point $cytomine_union_max_point " +
                            "--cytomine_union_nb_zones_width $cytomine_union_nb_zones_width " +
                            "--cytomine_union_nb_zones_height $cytomine_union_nb_zones_height " +
                            "--cytomine_predict_term $cytomine_predict_term " +
                            "#--cytomine_min_area $cytomine_min_area " +
                            "#--cytomine_max_area $cytomine_max_area "); // two last arguments are commented. ??



            // set by server
            cytomine.addSoftwareParameter("cytomine_id_software", "Number", software.getId(), "", true, 600, null, null, null, true);
            cytomine.addSoftwareParameter("cytomine_id_project", "Number", software.getId(), "", true, 700, null, null, null, true);
            // set by user
            cytomine.addSoftwareParameter("cytomine_id_image", "Number", software.getId(), "", true, 800);
            cytomine.addSoftwareParameter("cytomine_tile_size", "Number", software.getId(), "512", true, 900);
            cytomine.addSoftwareParameter("cytomine_zoom_level", "Number", software.getId(), "0", true, 1000);
            cytomine.addSoftwareParameter("cytomine_tile_overlap", "Number", software.getId(), "0", true, 1100);
            cytomine.addSoftwareParameter("cytomine_filter", "String", software.getId(), "adaptive", true, 1200); //adaptive,binary or otsu
            cytomine.addSoftwareParameter("cytomine_union_minlength", "Number", software.getId(), "10", true, 1300);
            cytomine.addSoftwareParameter("cytomine_union_bufferoverlap", "Number", software.getId(), "5", true, 1400);
            cytomine.addSoftwareParameter("cytomine_union_area", "Number", software.getId(), "5000", true, 1500);
            cytomine.addSoftwareParameter("cytomine_union_min_point_for_simplify", "Number", software.getId(), "1000", true, 1600);
            cytomine.addSoftwareParameter("cytomine_union_min_point", "Number", software.getId(), "500", true, 1700);
            cytomine.addSoftwareParameter("cytomine_union_max_point", "Number", software.getId(), "1000", true, 1800);
            cytomine.addSoftwareParameter("cytomine_union_nb_zones_width", "Number", software.getId(), "5", true, 1900);
            cytomine.addSoftwareParameter("cytomine_union_nb_zones_height", "Number", software.getId(), "5", true, 2000);
            cytomine.addSoftwareParameter("cytomine_predict_term", "Number", software.getId(), "", true, 2100);


        } catch (CytomineException e) {
            log.error(e);
        }
    }

    // NOT TESTED
    public static void addSoftwareCellClassifierPrediction(Cytomine cytomine) throws Exception {
        try{
            Software software = cytomine.addSoftware("Segmentation_Model_Predict", "createRabbitJobWithArgsService", "ValidateAnnotation",
                    "python algo/classification_prediction/add_and_run_job.py " +
                            "--cytomine_host $host " +
                            "--cytomine_public_key $public_key " +
                            "--cytomine_private_key $private_key " +
                            "--cytomine_base_path /api/ " +
                            "--cytomine_id_software $cytomine_id_software " +
                            "--cytomine_working_path algo/lassification_prediction/ " +
                            "--cytomine_id_project $cytomine_id_project " +
                            "--cytomine_id_image $cytomine_id_image " +
                            "--cytomine_zoom_level $cytomine_zoom_level " +
                            "--cytomine_id_userjob $cytomine_id_userjob " +
                            "--pyxit_save_to algo/lassification_prediction/ " +
                            "--cytomine_dump_type $cytomine_dump_type ");





            // set by server
            cytomine.addSoftwareParameter("cytomine_id_software", "Number", software.getId(), "", true, 500, null, null, null, true);
            cytomine.addSoftwareParameter("cytomine_id_project", "Number", software.getId(), "", true, 700, null, null, null, true);
            //cytomine.addSoftwareParameter("pyxit_save_to", "String", software.getId(), "algo/segmentation_prediction/logs/segmentation_tumor_model.pkl", true, 1200, null, null, null, true);
            // set by user
            cytomine.addSoftwareParameter("cytomine_id_image", "Number", software.getId(), "", true, 800);
            cytomine.addSoftwareParameter("cytomine_zoom_level", "Number", software.getId(), "0", true, 900);
            cytomine.addSoftwareParameter("cytomine_id_userjob", "Number", software.getId(), "1", true, 1000);
            cytomine.addSoftwareParameter("cytomine_dump_type", "Number", software.getId(), "1", true, 1200);


        } catch (CytomineException e) {
            log.error(e);
        }
    }


    // NOT TESTED
    public static void addSoftwareBONUS(Cytomine cytomine) throws Exception { // wait for the real name
        try{
            Software software = cytomine.addSoftware("BONUS", "createRabbitJobWithArgsService", "ValidateAnnotation", // wait for the real name
                    "python algo/classification_validation/add_and_run_job.py " +
                            "--cytomine_host $host " +
                            "--cytomine_public_key $public_key " +
                            "--cytomine_private_key $private_key " +
                            "--cytomine_base_path /api/ " +
                            "--cytomine_id_software $software " +
                            "--cytomine_working_path algo/classification_validation/annotations/ " +
                            "--cytomine_id_project $id_project " +

                            "--cytomine_annotation_projects $annotation_projects " +
                            "-z $zoom " +
                            "--cytomine_excluded_terms $excluded_terms " +
                            "--pyxit_target_width $pyxit_target_width " +
                            "--pyxit_target_height $pyxit_target_height " +
                            "--pyxit_colorspace $colorspace " +
                            "--pyxit_n_jobs $pyxit_n_jobs " +
                            "$pyxit_transpose " +
                            "--pyxit_min_size $min_size " +
                            "--pyxit_max_size $max_size " +
                            "--pyxit_interpolation $interpolation " +
                            "--forest_n_estimators $forest_n_estimators " +
                            "--forest_max_features $forest_max_features " +
                            "--forest_min_samples_split $forest_min_samples_split " +
                            "--pyxit_n_subwindows $pyxit_n_subwindows " +
                            "--cytomine_dump_type 1 " +
                            "--svm $svm " +
                            "--pyxit_save_to algo/classification_validation/ " +
                            "--cv_k_folds $cv_k_folds " +
                            "#--cytomine_fixed_tile " +
                            "--cytomine_n_shifts 2 "); // two last arguments are commented. ??


            // not used in my command. :/
            /*conn.add_software_parameter("pyxit_fixed_size", software.id, "Boolean", "false", True, 950, False)
            conn.add_software_parameter("dir_ls", software.id, "String", "/tmp", False, 10, False)
            conn.add_software_parameter("svm_c", software.id, "Number", 1.0, False, 1700,False)*/


            // set by server
            cytomine.addSoftwareParameter("cytomine_id_software", "Number", software.getId(), "", true, 500, null, null, null, true);
            cytomine.addSoftwareParameter("cytomine_id_project", "Number", software.getId(), "", true, 700, null, null, null, true);
            //cytomine.addSoftwareParameter("pyxit_save_to", "String", software.getId(), "algo/segmentation_prediction/logs/segmentation_tumor_model.pkl", true, 2400, null, null, null, true);
            // set by user
            cytomine.addSoftwareParameter("cytomine_annotation_projects", "List", software.getId(), "", true, 800); // ???
            cytomine.addSoftwareParameter("zoom", "Number", software.getId(), "0", true, 900);
            cytomine.addSoftwareParameter("excluded_terms", "List", software.getId(), "", true, 1000); // ???
            cytomine.addSoftwareParameter("pyxit_target_width", "Number", software.getId(), "16", true, 1100);
            cytomine.addSoftwareParameter("pyxit_target_height", "Number", software.getId(), "16", true, 1200);
            cytomine.addSoftwareParameter("colorspace", "Number", software.getId(), "2", true, 1300);
            cytomine.addSoftwareParameter("pyxit_n_jobs", "Number", software.getId(), "-1", true, 1400);
            cytomine.addSoftwareParameter("min_size", "Number", software.getId(), "0", true, 1600);
            cytomine.addSoftwareParameter("max_size", "Number", software.getId(), "0", true, 1700);
            cytomine.addSoftwareParameter("interpolation", "Number", software.getId(), "0", true, 1800);
            cytomine.addSoftwareParameter("forest_n_estimators", "Number", software.getId(), "0", true, 1900);
            cytomine.addSoftwareParameter("forest_max_features", "Number", software.getId(), "0", true, 2000);
            cytomine.addSoftwareParameter("forest_min_samples_split", "Number", software.getId(), "0", true, 2100);
            cytomine.addSoftwareParameter("pyxit_n_subwindows", "Number", software.getId(), "0", true, 2200);
            cytomine.addSoftwareParameter("cytomine_dump_type", "Number", software.getId(), "1", true, 2300);
            cytomine.addSoftwareParameter("svm", "Number", software.getId(), "0", true, 2400);
            cytomine.addSoftwareParameter("cv_k_folds", "Number", software.getId(), "10", true, 2600);


            // parameters without value
            cytomine.addSoftwareParameter("pyxit_transpose", "String", software.getId(), "--pyxit_transpose", true, 1500);




        } catch (CytomineException e) {
            log.error(e);
        }
    }


}
