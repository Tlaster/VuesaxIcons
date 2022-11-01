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

public val BoldGroup.Velas: ImageVector
    get() {
        if (_velas != null) {
            return _velas!!
        }
        _velas = Builder(name = "Velas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.1484f)
                horizontalLineTo(3.0f)
                curveTo(2.59f, 3.1484f, 2.25f, 3.4884f, 2.25f, 3.8984f)
                curveTo(2.25f, 4.3084f, 2.59f, 4.6484f, 3.0f, 4.6484f)
                horizontalLineTo(21.0f)
                curveTo(21.41f, 4.6484f, 21.75f, 4.3084f, 21.75f, 3.8984f)
                curveTo(21.75f, 3.4884f, 21.41f, 3.1484f, 21.0f, 3.1484f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0409f, 6.2383f)
                horizontalLineTo(19.9709f)
                curveTo(20.8509f, 6.2383f, 21.3809f, 7.2083f, 20.9009f, 7.9483f)
                lineTo(12.9409f, 20.3383f)
                curveTo(12.5009f, 21.0183f, 11.5109f, 21.0183f, 11.0709f, 20.3383f)
                lineTo(3.1109f, 7.9483f)
                curveTo(2.6309f, 7.2083f, 3.1609f, 6.2383f, 4.0409f, 6.2383f)
                close()
            }
        }
        .build()
        return _velas!!
    }

private var _velas: ImageVector? = null
