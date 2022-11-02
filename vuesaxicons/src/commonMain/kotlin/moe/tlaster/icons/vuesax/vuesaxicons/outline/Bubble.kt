package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Bubble: ImageVector
    get() {
        if (_bubble != null) {
            return _bubble!!
        }
        _bubble = Builder(name = "Bubble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5909f, 13.01f)
                curveTo(12.3509f, 13.01f, 9.7109f, 10.37f, 9.7109f, 7.13f)
                curveTo(9.7109f, 3.89f, 12.3509f, 1.25f, 15.5909f, 1.25f)
                curveTo(18.8309f, 1.25f, 21.4709f, 3.89f, 21.4709f, 7.13f)
                curveTo(21.4709f, 10.37f, 18.8309f, 13.01f, 15.5909f, 13.01f)
                close()
                moveTo(15.5909f, 2.75f)
                curveTo(13.1809f, 2.75f, 11.2109f, 4.71f, 11.2109f, 7.13f)
                curveTo(11.2109f, 9.55f, 13.1709f, 11.51f, 15.5909f, 11.51f)
                curveTo(18.0109f, 11.51f, 19.9709f, 9.55f, 19.9709f, 7.13f)
                curveTo(19.9709f, 4.71f, 18.0009f, 2.75f, 15.5909f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3612f, 20.19f)
                curveTo(4.2512f, 20.19f, 2.5313f, 18.47f, 2.5313f, 16.36f)
                curveTo(2.5313f, 14.25f, 4.2512f, 12.53f, 6.3612f, 12.53f)
                curveTo(8.4712f, 12.53f, 10.1913f, 14.25f, 10.1913f, 16.36f)
                curveTo(10.1913f, 18.47f, 8.4712f, 20.19f, 6.3612f, 20.19f)
                close()
                moveTo(6.3612f, 14.03f)
                curveTo(5.0812f, 14.03f, 4.0313f, 15.07f, 4.0313f, 16.36f)
                curveTo(4.0313f, 17.64f, 5.0712f, 18.69f, 6.3612f, 18.69f)
                curveTo(7.6412f, 18.69f, 8.6912f, 17.65f, 8.6912f, 16.36f)
                curveTo(8.6912f, 15.08f, 7.6412f, 14.03f, 6.3612f, 14.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6205f, 22.7499f)
                curveTo(14.7905f, 22.7499f, 13.3105f, 21.2599f, 13.3105f, 19.4399f)
                curveTo(13.3105f, 17.6099f, 14.8005f, 16.1299f, 16.6205f, 16.1299f)
                curveTo(18.4405f, 16.1299f, 19.9305f, 17.6199f, 19.9305f, 19.4399f)
                curveTo(19.9305f, 21.2599f, 18.4405f, 22.7499f, 16.6205f, 22.7499f)
                close()
                moveTo(16.6205f, 17.6199f)
                curveTo(15.6205f, 17.6199f, 14.8105f, 18.4299f, 14.8105f, 19.4299f)
                curveTo(14.8105f, 20.4299f, 15.6205f, 21.2399f, 16.6205f, 21.2399f)
                curveTo(17.6205f, 21.2399f, 18.4305f, 20.4299f, 18.4305f, 19.4299f)
                curveTo(18.4305f, 18.4399f, 17.6205f, 17.6199f, 16.6205f, 17.6199f)
                close()
            }
        }
        .build()
        return _bubble!!
    }

private var _bubble: ImageVector? = null
