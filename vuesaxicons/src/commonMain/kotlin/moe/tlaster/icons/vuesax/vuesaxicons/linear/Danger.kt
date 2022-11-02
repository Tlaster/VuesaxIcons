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

public val LinearGroup.Danger: ImageVector
    get() {
        if (_danger != null) {
            return _danger!!
        }
        _danger = Builder(name = "Danger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                verticalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0001f, 21.41f)
                horizontalLineTo(5.9401f)
                curveTo(2.4701f, 21.41f, 1.0201f, 18.93f, 2.7001f, 15.9f)
                lineTo(5.8201f, 10.28f)
                lineTo(8.7601f, 5.0f)
                curveTo(10.5401f, 1.79f, 13.4601f, 1.79f, 15.2401f, 5.0f)
                lineTo(18.1801f, 10.29f)
                lineTo(21.3001f, 15.91f)
                curveTo(22.9801f, 18.94f, 21.5201f, 21.42f, 18.0601f, 21.42f)
                horizontalLineTo(12.0001f)
                verticalLineTo(21.41f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9945f, 17.0f)
                horizontalLineTo(12.0035f)
            }
        }
        .build()
        return _danger!!
    }

private var _danger: ImageVector? = null
