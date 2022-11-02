package moe.tlaster.icons.vuesax.vuesaxicons.crypto.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BulkGroup

public val BulkGroup.Velas: ImageVector
    get() {
        if (_velas != null) {
            return _velas!!
        }
        _velas = Builder(name = "Velas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.1499f)
                horizontalLineTo(3.0f)
                curveTo(2.59f, 3.1499f, 2.25f, 3.4899f, 2.25f, 3.8999f)
                curveTo(2.25f, 4.3099f, 2.59f, 4.6499f, 3.0f, 4.6499f)
                horizontalLineTo(21.0f)
                curveTo(21.41f, 4.6499f, 21.75f, 4.3099f, 21.75f, 3.8999f)
                curveTo(21.75f, 3.4899f, 21.41f, 3.1499f, 21.0f, 3.1499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0391f, 6.2397f)
                horizontalLineTo(19.9691f)
                curveTo(20.8491f, 6.2397f, 21.3791f, 7.2098f, 20.8991f, 7.9497f)
                lineTo(12.9391f, 20.3397f)
                curveTo(12.4991f, 21.0197f, 11.5091f, 21.0197f, 11.0691f, 20.3397f)
                lineTo(3.0991f, 7.9497f)
                curveTo(2.6291f, 7.2098f, 3.1591f, 6.2397f, 4.0391f, 6.2397f)
                close()
            }
        }
        .build()
        return _velas!!
    }

private var _velas: ImageVector? = null
