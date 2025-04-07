using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
public class SceneNavigation : MonoBehaviour
{
    public GameObject activeScene;
    public GameObject nextScene;
    
public void btnNextScene()
    {
        activeScene.gameObject.SetActive(false);
        nextScene.gameObject.SetActive(true);
    }


}
