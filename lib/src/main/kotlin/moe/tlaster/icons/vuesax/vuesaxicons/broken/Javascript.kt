package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Javascript: ImageVector
    get() {
        if (_javascript != null) {
            return _javascript!!
        }
        _javascript = Builder(name = "Javascript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.62f, 7.01f)
                verticalLineTo(15.99f)
                lineTo(7.5f, 15.09f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5004f, 7.0f)
                lineTo(13.3503f, 7.45f)
                verticalLineTo(12.4f)
                lineTo(16.5004f, 11.95f)
                verticalLineTo(15.1f)
                lineTo(12.9004f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.3202f, 4.91f)
                lineTo(3.1202f, 3.11f)
                curveTo(3.0502f, 2.52f, 3.5202f, 2.0f, 4.1102f, 2.0f)
                horizontalLineTo(19.8802f)
                curveTo(20.4802f, 2.0f, 20.9402f, 2.52f, 20.8702f, 3.11f)
                lineTo(19.0702f, 19.33f)
                curveTo(19.0302f, 19.73f, 18.7402f, 20.07f, 18.3502f, 20.18f)
                lineTo(12.2702f, 21.92f)
                curveTo(12.0902f, 21.97f, 11.9002f, 21.97f, 11.7202f, 21.92f)
                lineTo(5.6402f, 20.18f)
                curveTo(5.2502f, 20.07f, 4.9702f, 19.73f, 4.9202f, 19.33f)
                lineTo(3.8202f, 9.41f)
            }
        }
        .build()
        return _javascript!!
    }

private var _javascript: ImageVector? = null
