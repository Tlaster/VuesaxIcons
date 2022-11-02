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

public val LinearGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.79f, 14.9299f)
                curveTo(17.73f, 16.9799f, 14.78f, 17.6099f, 12.19f, 16.7999f)
                lineTo(7.48f, 21.4999f)
                curveTo(7.14f, 21.8499f, 6.47f, 22.0599f, 5.99f, 21.9899f)
                lineTo(3.81f, 21.6899f)
                curveTo(3.09f, 21.5899f, 2.42f, 20.9099f, 2.31f, 20.1899f)
                lineTo(2.01f, 18.0099f)
                curveTo(1.94f, 17.5299f, 2.17f, 16.8599f, 2.5f, 16.5199f)
                lineTo(7.2f, 11.8199f)
                curveTo(6.4f, 9.2199f, 7.02f, 6.2699f, 9.08f, 4.22f)
                curveTo(12.03f, 1.27f, 16.82f, 1.27f, 19.78f, 4.22f)
                curveTo(22.74f, 7.17f, 22.74f, 11.9799f, 19.79f, 14.9299f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.89f, 17.49f)
                lineTo(9.19f, 19.79f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 11.0f)
                curveTo(15.3284f, 11.0f, 16.0f, 10.3284f, 16.0f, 9.5f)
                curveTo(16.0f, 8.6716f, 15.3284f, 8.0f, 14.5f, 8.0f)
                curveTo(13.6716f, 8.0f, 13.0f, 8.6716f, 13.0f, 9.5f)
                curveTo(13.0f, 10.3284f, 13.6716f, 11.0f, 14.5f, 11.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
