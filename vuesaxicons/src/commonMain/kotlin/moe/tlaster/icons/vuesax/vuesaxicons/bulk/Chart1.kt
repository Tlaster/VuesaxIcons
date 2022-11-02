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

public val BulkGroup.Chart1: ImageVector
    get() {
        if (_chart1 != null) {
            return _chart1!!
        }
        _chart1 = Builder(name = "Chart1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 22.75f)
                horizontalLineTo(3.0f)
                curveTo(2.59f, 22.75f, 2.25f, 22.41f, 2.25f, 22.0f)
                curveTo(2.25f, 21.59f, 2.59f, 21.25f, 3.0f, 21.25f)
                horizontalLineTo(21.0f)
                curveTo(21.41f, 21.25f, 21.75f, 21.59f, 21.75f, 22.0f)
                curveTo(21.75f, 22.41f, 21.41f, 22.75f, 21.0f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6f, 8.3799f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 8.3799f, 3.0f, 8.8299f, 3.0f, 9.3799f)
                verticalLineTo(17.9999f)
                curveTo(3.0f, 18.5499f, 3.45f, 18.9999f, 4.0f, 18.9999f)
                horizontalLineTo(5.6f)
                curveTo(6.15f, 18.9999f, 6.6f, 18.5499f, 6.6f, 17.9999f)
                verticalLineTo(9.3799f)
                curveTo(6.6f, 8.8199f, 6.15f, 8.3799f, 5.6f, 8.3799f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7992f, 5.1899f)
                horizontalLineTo(11.1992f)
                curveTo(10.6492f, 5.1899f, 10.1992f, 5.6399f, 10.1992f, 6.1899f)
                verticalLineTo(17.9999f)
                curveTo(10.1992f, 18.5499f, 10.6492f, 18.9999f, 11.1992f, 18.9999f)
                horizontalLineTo(12.7992f)
                curveTo(13.3492f, 18.9999f, 13.7992f, 18.5499f, 13.7992f, 17.9999f)
                verticalLineTo(6.1899f)
                curveTo(13.7992f, 5.6399f, 13.3492f, 5.1899f, 12.7992f, 5.1899f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0004f, 2.0f)
                horizontalLineTo(18.4004f)
                curveTo(17.8504f, 2.0f, 17.4004f, 2.45f, 17.4004f, 3.0f)
                verticalLineTo(18.0f)
                curveTo(17.4004f, 18.55f, 17.8504f, 19.0f, 18.4004f, 19.0f)
                horizontalLineTo(20.0004f)
                curveTo(20.5504f, 19.0f, 21.0004f, 18.55f, 21.0004f, 18.0f)
                verticalLineTo(3.0f)
                curveTo(21.0004f, 2.45f, 20.5504f, 2.0f, 20.0004f, 2.0f)
                close()
            }
        }
        .build()
        return _chart1!!
    }

private var _chart1: ImageVector? = null
