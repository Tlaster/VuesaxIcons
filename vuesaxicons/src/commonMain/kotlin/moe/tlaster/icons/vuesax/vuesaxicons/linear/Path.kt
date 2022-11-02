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

public val LinearGroup.Path: ImageVector
    get() {
        if (_path != null) {
            return _path!!
        }
        _path = Builder(name = "Path", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.79f, 7.2701f)
                lineTo(16.76f, 4.2401f)
                curveTo(15.61f, 3.0901f, 14.04f, 3.1501f, 13.27f, 4.3801f)
                lineTo(11.58f, 7.0501f)
                lineTo(16.98f, 12.4501f)
                lineTo(19.65f, 10.7601f)
                curveTo(20.8f, 10.0301f, 20.87f, 8.3501f, 19.79f, 7.2701f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.58f, 7.05f)
                lineTo(7.65f, 6.81f)
                curveTo(5.46f, 6.68f, 4.69f, 7.35f, 4.45f, 9.44f)
                lineTo(3.47f, 17.76f)
                curveTo(3.26f, 19.51f, 4.53f, 20.77f, 6.27f, 20.56f)
                lineTo(14.59f, 19.58f)
                curveTo(16.68f, 19.33f, 17.44f, 18.57f, 17.22f, 16.38f)
                lineTo(16.99f, 12.45f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.61f, 19.4199f)
                lineTo(7.64f, 16.3799f)
            }
        }
        .build()
        return _path!!
    }

private var _path: ImageVector? = null
