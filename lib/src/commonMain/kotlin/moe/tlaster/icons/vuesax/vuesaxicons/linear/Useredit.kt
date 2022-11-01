package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Useredit: ImageVector
    get() {
        if (_useredit != null) {
            return _useredit!!
        }
        _useredit = Builder(name = "Useredit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveTo(14.7614f, 12.0f, 17.0f, 9.7614f, 17.0f, 7.0f)
                curveTo(17.0f, 4.2386f, 14.7614f, 2.0f, 12.0f, 2.0f)
                curveTo(9.2386f, 2.0f, 7.0f, 4.2386f, 7.0f, 7.0f)
                curveTo(7.0f, 9.7614f, 9.2386f, 12.0f, 12.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.2101f, 15.74f)
                lineTo(15.67f, 19.2801f)
                curveTo(15.53f, 19.4201f, 15.4f, 19.68f, 15.37f, 19.87f)
                lineTo(15.18f, 21.22f)
                curveTo(15.11f, 21.71f, 15.45f, 22.05f, 15.94f, 21.98f)
                lineTo(17.29f, 21.79f)
                curveTo(17.48f, 21.76f, 17.75f, 21.63f, 17.88f, 21.49f)
                lineTo(21.42f, 17.95f)
                curveTo(22.03f, 17.34f, 22.32f, 16.63f, 21.42f, 15.73f)
                curveTo(20.53f, 14.84f, 19.8201f, 15.13f, 19.2101f, 15.74f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.7001f, 16.25f)
                curveTo(19.0001f, 17.33f, 19.84f, 18.17f, 20.92f, 18.47f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4099f, 22.0f)
                curveTo(3.4099f, 18.13f, 7.2599f, 15.0f, 11.9999f, 15.0f)
                curveTo(13.0399f, 15.0f, 14.0399f, 15.15f, 14.9699f, 15.43f)
            }
        }
        .build()
        return _useredit!!
    }

private var _useredit: ImageVector? = null
