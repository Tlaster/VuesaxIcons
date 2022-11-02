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

public val LinearGroup.Backward5seconds: ImageVector
    get() {
        if (_backward5seconds != null) {
            return _backward5seconds!!
        }
        _backward5seconds = Builder(name = "Backward5seconds", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.91f, 10.8301f)
                horizontalLineTo(10.85f)
                lineTo(10.09f, 13.1201f)
                horizontalLineTo(12.38f)
                curveTo(13.22f, 13.1201f, 13.91f, 13.8001f, 13.91f, 14.6501f)
                curveTo(13.91f, 15.4901f, 13.23f, 16.1801f, 12.38f, 16.1801f)
                horizontalLineTo(10.09f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.02f, 4.47f)
                lineTo(12.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.91f, 7.8f)
                curveTo(3.8f, 9.28f, 3.11f, 11.11f, 3.11f, 13.11f)
                curveTo(3.11f, 18.02f, 7.09f, 22.0f, 12.0f, 22.0f)
                curveTo(16.91f, 22.0f, 20.89f, 18.02f, 20.89f, 13.11f)
                curveTo(20.89f, 8.2f, 16.91f, 4.22f, 12.0f, 4.22f)
                curveTo(11.32f, 4.22f, 10.66f, 4.31f, 10.02f, 4.46f)
            }
        }
        .build()
        return _backward5seconds!!
    }

private var _backward5seconds: ImageVector? = null
