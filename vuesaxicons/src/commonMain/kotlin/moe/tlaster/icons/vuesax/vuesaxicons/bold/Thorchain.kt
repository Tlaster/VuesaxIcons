package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Thorchain: ImageVector
    get() {
        if (_thorchain != null) {
            return _thorchain!!
        }
        _thorchain = Builder(name = "Thorchain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3794f, 17.5692f)
                lineTo(6.0794f, 21.9092f)
                curveTo(5.0094f, 22.3592f, 4.0794f, 21.0292f, 4.8694f, 20.1792f)
                lineTo(12.6794f, 11.6992f)
                lineTo(16.7294f, 15.8192f)
                curveTo(17.2694f, 16.3592f, 17.0894f, 17.2792f, 16.3794f, 17.5692f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.171f, 3.7711f)
                lineTo(12.681f, 11.7011f)
                lineTo(8.631f, 7.6011f)
                curveTo(8.091f, 7.0511f, 8.271f, 6.1311f, 8.981f, 5.8411f)
                lineTo(17.921f, 2.0911f)
                curveTo(18.961f, 1.6511f, 19.891f, 2.9011f, 19.171f, 3.7711f)
                close()
            }
        }
        .build()
        return _thorchain!!
    }

private var _thorchain: ImageVector? = null
