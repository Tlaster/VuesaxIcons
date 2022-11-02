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

public val BulkGroup.Backwarditem: ImageVector
    get() {
        if (_backwarditem != null) {
            return _backwarditem!!
        }
        _backwarditem = Builder(name = "Backwarditem", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.25f, 5.15f)
                verticalLineTo(7.85f)
                curveTo(21.25f, 9.69f, 20.69f, 10.25f, 18.85f, 10.25f)
                horizontalLineTo(16.15f)
                curveTo(14.31f, 10.25f, 13.75f, 9.69f, 13.75f, 7.85f)
                verticalLineTo(5.15f)
                curveTo(13.75f, 3.31f, 14.31f, 2.75f, 16.15f, 2.75f)
                horizontalLineTo(18.85f)
                curveTo(20.69f, 2.75f, 21.25f, 3.31f, 21.25f, 5.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.25f, 16.15f)
                verticalLineTo(18.85f)
                curveTo(10.25f, 20.69f, 9.69f, 21.25f, 7.85f, 21.25f)
                horizontalLineTo(5.15f)
                curveTo(3.31f, 21.25f, 2.75f, 20.69f, 2.75f, 18.85f)
                verticalLineTo(16.15f)
                curveTo(2.75f, 14.31f, 3.31f, 13.75f, 5.15f, 13.75f)
                horizontalLineTo(7.85f)
                curveTo(9.69f, 13.75f, 10.25f, 14.31f, 10.25f, 16.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6291f, 11.7501f)
                verticalLineTo(13.6201f)
                curveTo(16.6291f, 15.9001f, 15.8991f, 16.6301f, 13.6191f, 16.6301f)
                horizontalLineTo(11.7491f)
                verticalLineTo(16.1501f)
                curveTo(11.7491f, 13.4901f, 10.5091f, 12.2501f, 7.8491f, 12.2501f)
                horizontalLineTo(7.3691f)
                verticalLineTo(10.3801f)
                curveTo(7.3691f, 8.1001f, 8.0991f, 7.3701f, 10.3791f, 7.3701f)
                horizontalLineTo(12.2491f)
                verticalLineTo(7.8501f)
                curveTo(12.2491f, 10.5101f, 13.4891f, 11.7501f, 16.1491f, 11.7501f)
                horizontalLineTo(16.6291f)
                close()
            }
        }
        .build()
        return _backwarditem!!
    }

private var _backwarditem: ImageVector? = null
