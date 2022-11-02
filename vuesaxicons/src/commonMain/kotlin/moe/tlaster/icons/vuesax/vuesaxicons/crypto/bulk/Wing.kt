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

public val BulkGroup.Wing: ImageVector
    get() {
        if (_wing != null) {
            return _wing!!
        }
        _wing = Builder(name = "Wing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
                moveTo(16.8604f, 5.0f)
                horizontalLineTo(19.2104f)
                curveTo(19.3904f, 5.0f, 19.5504f, 5.1f, 19.6404f, 5.25f)
                lineTo(22.0504f, 9.45f)
                curveTo(22.1404f, 9.6f, 22.1404f, 9.79f, 22.0504f, 9.94f)
                lineTo(17.4104f, 18.24f)
                curveTo(17.2204f, 18.58f, 16.7404f, 18.58f, 16.5404f, 18.25f)
                lineTo(15.2804f, 16.14f)
                curveTo(15.1904f, 15.98f, 15.1904f, 15.79f, 15.2804f, 15.64f)
                lineTo(18.5404f, 9.94f)
                curveTo(18.6304f, 9.79f, 18.6304f, 9.6f, 18.5404f, 9.44f)
                lineTo(16.4104f, 5.74f)
                curveTo(16.2404f, 5.42f, 16.4804f, 5.0f, 16.8604f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.8604f, 5.0f)
                horizontalLineTo(12.2104f)
                curveTo(12.3904f, 5.0f, 12.5504f, 5.1f, 12.6404f, 5.25f)
                lineTo(15.0504f, 9.45f)
                curveTo(15.1404f, 9.6f, 15.1404f, 9.79f, 15.0504f, 9.94f)
                lineTo(10.4104f, 18.24f)
                curveTo(10.2204f, 18.58f, 9.7404f, 18.58f, 9.5404f, 18.25f)
                lineTo(8.2804f, 16.14f)
                curveTo(8.1904f, 15.98f, 8.1904f, 15.79f, 8.2804f, 15.64f)
                lineTo(11.5404f, 9.94f)
                curveTo(11.6304f, 9.79f, 11.6304f, 9.6f, 11.5404f, 9.44f)
                lineTo(9.4104f, 5.74f)
                curveTo(9.2404f, 5.42f, 9.4804f, 5.0f, 9.8604f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.8008f, 5.0f)
                horizontalLineTo(5.0108f)
                curveTo(5.1908f, 5.0f, 5.3608f, 5.1f, 5.4508f, 5.25f)
                lineTo(7.8708f, 9.54f)
                curveTo(7.9608f, 9.69f, 7.9608f, 9.88f, 7.8708f, 10.04f)
                lineTo(6.7508f, 11.96f)
                curveTo(6.5608f, 12.29f, 6.0808f, 12.29f, 5.8908f, 11.96f)
                lineTo(1.8008f, 5.0f)
                close()
            }
        }
        .build()
        return _wing!!
    }

private var _wing: ImageVector? = null
