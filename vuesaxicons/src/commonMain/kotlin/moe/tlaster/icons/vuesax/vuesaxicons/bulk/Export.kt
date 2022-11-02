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

public val BulkGroup.Export: ImageVector
    get() {
        if (_export != null) {
            return _export!!
        }
        _export = Builder(name = "Export", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7475f, 7.0f)
                horizontalLineTo(11.9175f)
                curveTo(11.5075f, 7.0f, 11.1675f, 7.34f, 11.1675f, 7.75f)
                curveTo(11.1675f, 8.16f, 11.5075f, 8.5f, 11.9175f, 8.5f)
                horizontalLineTo(14.9375f)
                lineTo(7.2175f, 16.22f)
                curveTo(6.9275f, 16.51f, 6.9275f, 16.99f, 7.2175f, 17.28f)
                curveTo(7.3675f, 17.43f, 7.5575f, 17.5f, 7.7475f, 17.5f)
                curveTo(7.9375f, 17.5f, 8.1275f, 17.43f, 8.2775f, 17.28f)
                lineTo(15.9975f, 9.56f)
                verticalLineTo(12.58f)
                curveTo(15.9975f, 12.99f, 16.3375f, 13.33f, 16.7475f, 13.33f)
                curveTo(17.1575f, 13.33f, 17.4975f, 12.99f, 17.4975f, 12.58f)
                verticalLineTo(7.75f)
                curveTo(17.4975f, 7.34f, 17.1575f, 7.0f, 16.7475f, 7.0f)
                close()
            }
        }
        .build()
        return _export!!
    }

private var _export: ImageVector? = null
