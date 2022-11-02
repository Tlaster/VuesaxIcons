package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = Builder(name = "Bank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 18.45f, 2.45f, 18.0f, 3.0f, 18.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 18.0f, 22.0f, 18.45f, 22.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 22.75f)
                horizontalLineTo(1.0f)
                curveTo(0.59f, 22.75f, 0.25f, 22.41f, 0.25f, 22.0f)
                curveTo(0.25f, 21.59f, 0.59f, 21.25f, 1.0f, 21.25f)
                horizontalLineTo(23.0f)
                curveTo(23.41f, 21.25f, 23.75f, 21.59f, 23.75f, 22.0f)
                curveTo(23.75f, 22.41f, 23.41f, 22.75f, 23.0f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.37f, 5.7498f)
                lineTo(12.37f, 2.1498f)
                curveTo(12.17f, 2.0698f, 11.83f, 2.0698f, 11.63f, 2.1498f)
                lineTo(2.63f, 5.7498f)
                curveTo(2.28f, 5.8898f, 2.0f, 6.2998f, 2.0f, 6.6798f)
                verticalLineTo(9.9998f)
                curveTo(2.0f, 10.5498f, 2.45f, 10.9998f, 3.0f, 10.9998f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 10.9998f, 22.0f, 10.5498f, 22.0f, 9.9998f)
                verticalLineTo(6.6798f)
                curveTo(22.0f, 6.2998f, 21.72f, 5.8898f, 21.37f, 5.7498f)
                close()
                moveTo(12.0f, 8.4998f)
                curveTo(11.17f, 8.4998f, 10.5f, 7.8298f, 10.5f, 6.9998f)
                curveTo(10.5f, 6.1698f, 11.17f, 5.4998f, 12.0f, 5.4998f)
                curveTo(12.83f, 5.4998f, 13.5f, 6.1698f, 13.5f, 6.9998f)
                curveTo(13.5f, 7.8298f, 12.83f, 8.4998f, 12.0f, 8.4998f)
                close()
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null
