package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Flashcircle1: ImageVector
    get() {
        if (_flashcircle1 != null) {
            return _flashcircle1!!
        }
        _flashcircle1 = Builder(name = "Flashcircle1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6794f, 11.9098f)
                lineTo(10.3294f, 12.3198f)
                lineTo(9.3794f, 16.1598f)
                curveTo(9.1594f, 17.0598f, 9.5994f, 17.3599f, 10.3594f, 16.8299f)
                lineTo(15.5394f, 13.2398f)
                curveTo(16.1694f, 12.7998f, 16.0794f, 12.2898f, 15.3294f, 12.0998f)
                lineTo(13.6794f, 11.6898f)
                lineTo(14.6294f, 7.8498f)
                curveTo(14.8494f, 6.9498f, 14.4094f, 6.6498f, 13.6494f, 7.1798f)
                lineTo(8.4694f, 10.7699f)
                curveTo(7.8394f, 11.2099f, 7.9294f, 11.7198f, 8.6794f, 11.9098f)
                close()
            }
        }
        .build()
        return _flashcircle1!!
    }

private var _flashcircle1: ImageVector? = null
