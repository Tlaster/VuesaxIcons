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

public val LinearGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(15.7279f, 15.0f, 18.75f, 12.0899f, 18.75f, 8.5f)
                curveTo(18.75f, 4.9102f, 15.7279f, 2.0f, 12.0f, 2.0f)
                curveTo(8.2721f, 2.0f, 5.25f, 4.9102f, 5.25f, 8.5f)
                curveTo(5.25f, 12.0899f, 8.2721f, 15.0f, 12.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.52f, 13.52f)
                lineTo(7.51f, 20.9f)
                curveTo(7.51f, 21.8f, 8.14f, 22.24f, 8.92f, 21.87f)
                lineTo(11.6f, 20.6f)
                curveTo(11.82f, 20.49f, 12.19f, 20.49f, 12.41f, 20.6f)
                lineTo(15.1f, 21.87f)
                curveTo(15.87f, 22.23f, 16.51f, 21.8f, 16.51f, 20.9f)
                verticalLineTo(13.34f)
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
