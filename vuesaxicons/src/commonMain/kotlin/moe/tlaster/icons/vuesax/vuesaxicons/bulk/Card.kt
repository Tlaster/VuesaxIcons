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

public val BulkGroup.Card: ImageVector
    get() {
        if (_card != null) {
            return _card!!
        }
        _card = Builder(name = "Card", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                verticalLineTo(16.46f)
                curveTo(22.0f, 18.75f, 20.14f, 20.6f, 17.85f, 20.6f)
                horizontalLineTo(6.15f)
                curveTo(3.86f, 20.6f, 2.0f, 18.75f, 2.0f, 16.46f)
                verticalLineTo(9.0f)
                horizontalLineTo(22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.5399f)
                verticalLineTo(8.9999f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.5399f)
                curveTo(2.0f, 5.2499f, 3.86f, 3.3999f, 6.15f, 3.3999f)
                horizontalLineTo(17.85f)
                curveTo(20.14f, 3.3999f, 22.0f, 5.2499f, 22.0f, 7.5399f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 17.25f)
                horizontalLineTo(6.0f)
                curveTo(5.59f, 17.25f, 5.25f, 16.91f, 5.25f, 16.5f)
                curveTo(5.25f, 16.09f, 5.59f, 15.75f, 6.0f, 15.75f)
                horizontalLineTo(8.0f)
                curveTo(8.41f, 15.75f, 8.75f, 16.09f, 8.75f, 16.5f)
                curveTo(8.75f, 16.91f, 8.41f, 17.25f, 8.0f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 17.25f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 17.25f, 9.75f, 16.91f, 9.75f, 16.5f)
                curveTo(9.75f, 16.09f, 10.09f, 15.75f, 10.5f, 15.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 15.75f, 15.25f, 16.09f, 15.25f, 16.5f)
                curveTo(15.25f, 16.91f, 14.91f, 17.25f, 14.5f, 17.25f)
                close()
            }
        }
        .build()
        return _card!!
    }

private var _card: ImageVector? = null
