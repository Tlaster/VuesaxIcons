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

public val BulkGroup.Ontology: ImageVector
    get() {
        if (_ontology != null) {
            return _ontology!!
        }
        _ontology = Builder(name = "Ontology", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.9007f, 19.68f)
                curveTo(16.1807f, 21.18f, 13.9107f, 22.07f, 11.4207f, 22.0f)
                curveTo(6.2507f, 21.86f, 2.2207f, 17.41f, 2.2207f, 12.24f)
                verticalLineTo(5.21f)
                curveTo(2.2207f, 4.76f, 2.7607f, 4.54f, 3.0707f, 4.86f)
                lineTo(17.9007f, 19.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.2207f, 4.3f)
                curveTo(7.9307f, 2.81f, 10.1807f, 1.93f, 12.6507f, 2.0f)
                curveTo(17.7807f, 2.14f, 21.7707f, 6.55f, 21.7707f, 11.68f)
                verticalLineTo(18.64f)
                curveTo(21.7707f, 19.09f, 21.2307f, 19.31f, 20.9207f, 18.99f)
                lineTo(6.2207f, 4.3f)
                close()
            }
        }
        .build()
        return _ontology!!
    }

private var _ontology: ImageVector? = null
