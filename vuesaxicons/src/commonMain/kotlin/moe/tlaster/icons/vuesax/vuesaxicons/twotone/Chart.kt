package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Chart: ImageVector
    get() {
        if (_chart != null) {
            return _chart!!
        }
        _chart = Builder(name = "Chart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 22.0f)
                horizontalLineTo(21.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.6f, 8.3799f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 8.3799f, 3.0f, 8.8299f, 3.0f, 9.3799f)
                verticalLineTo(17.9999f)
                curveTo(3.0f, 18.5499f, 3.45f, 18.9999f, 4.0f, 18.9999f)
                horizontalLineTo(5.6f)
                curveTo(6.15f, 18.9999f, 6.6f, 18.5499f, 6.6f, 17.9999f)
                verticalLineTo(9.3799f)
                curveTo(6.6f, 8.8299f, 6.15f, 8.3799f, 5.6f, 8.3799f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.8002f, 5.1899f)
                horizontalLineTo(11.2002f)
                curveTo(10.6502f, 5.1899f, 10.2002f, 5.6399f, 10.2002f, 6.1899f)
                verticalLineTo(17.9999f)
                curveTo(10.2002f, 18.5499f, 10.6502f, 18.9999f, 11.2002f, 18.9999f)
                horizontalLineTo(12.8002f)
                curveTo(13.3502f, 18.9999f, 13.8002f, 18.5499f, 13.8002f, 17.9999f)
                verticalLineTo(6.1899f)
                curveTo(13.8002f, 5.6399f, 13.3502f, 5.1899f, 12.8002f, 5.1899f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
        return _chart!!
    }

private var _chart: ImageVector? = null
